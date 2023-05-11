

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFrame extends JFrame{

    int count1 = 0;
    int count2 = 0;
    int ind = 0;
    boolean white;

    Logic log;
    ArrayList<JPanel> list = new ArrayList<JPanel>(); // Create the list
    ArrayList<JLabel> listLab = new ArrayList<JLabel>();



    MyFrame(Logic lo) throws InterruptedException, IOException {
        log = lo;
        this.setSize(816,839);
        this.setTitle("Titel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);
        ImageIcon image = new ImageIcon("ppp.png");
        this.getContentPane().setBackground(Color.cyan);

        String[] chessSquares = new String[64];
        int index = 0;

        MouseListen mouseListener = new MouseListen(this,log);
        this.addMouseListener(mouseListener);

        for (char file = 'a'; file <= 'h'; file++) {
            for (int rank = 8; rank >= 1; rank--) {
                chessSquares[index] = "" + file + rank;
                index++;
            }
        }




        while (count1<8){
            while (count2<8){


                list.add(new JPanel());



                list.get(ind).setName(chessSquares[ind]);
                if(white == true){
                    list.get(ind).setBackground(Color.white);
                    white = false;
                }else{
                    list.get(ind).setBackground(Color.gray);
                    white = true;
                }
                list.get(ind).setBounds((100*count1),(100*count2),100,100);
                list.get(ind).setVisible(true);
                this.add(list.get(ind));
                count2++;
                ind++;


            }
            if(white == true){
                white = false;
            }else{
                white = true;
            }
            count2 = 0;
            count1++;

        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if(log.board[i][j] == "WP"){

                    ind = ((j*8)+i);
                    System.out.println("found! at "+list.get(ind).getName());

                    listLab.add(new JLabel("WEE"));
                    listLab.get(count2).setFont(new Font("Arial", Font.PLAIN, 30));
                    listLab.get(count2).setHorizontalAlignment(JLabel.CENTER);
                    listLab.get(count2).setVisible(true);
                    list.get(ind).add(listLab.get(count2));
                    listLab.get(count2).setVisible(true);
                    count2++;
                }

            }
        }

        this.repaint();
        for (int i2 = 0; i2 < 64; i2++){
            list.get(ind).repaint();
            listLab.get(count2-2).repaint();
            this.repaint();
        }

    }

    public JPanel getBox(int n){
        return list.get(n);
    }
    
}
