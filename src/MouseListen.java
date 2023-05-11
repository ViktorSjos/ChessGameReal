import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListen implements MouseListener {

    int x;
    int y;
    MyFrame fra;
    Logic log;
    String move = "start";

    Pawn wp1;
    Pawn wp2;
    Pawn wp3;
    Pawn wp4;
    Pawn wp5;
    Pawn wp6;
    Pawn wp7;
    Pawn wp8;

    public MouseListen(MyFrame f, Logic lo){
        fra = f;
        log = lo;
        wp1 = new Pawn(log, 0,6, "wp1");
        wp2 = new Pawn(log, 1,6, "wp2");
        wp3 = new Pawn(log, 2,6, "wp3");
        wp4 = new Pawn(log, 3,6, "wp4");
        wp5 = new Pawn(log, 4,6, "wp5");
        wp6 = new Pawn(log, 5,6, "wp6");
        wp7 = new Pawn(log, 6,6, "wp7");
        wp8 = new Pawn(log, 7,6, "wp8");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        x = (x-8)/100;
        y = (y-32)/100;
        System.out.println("Mouse clicked at x = " + x + ", y = " + y);
        System.out.println(fra.getBox((x*8)+y));
        fra.getBox((x*8)+y).setBackground(Color.orange);
        System.out.println(fra.getBox((x*8)+y).getName());
        if(move.equals("WP")){
            System.out.println("move is222 "+move);
            log.board[x][y] = "WP";
            move = " ";
            log.drawBoard();
            return;
        }

        if(log.board[x][y] == "WP"){
            move = "WP";
            log.board[x][y] = "  ";
            System.out.println("move is "+move);
        }
        log.drawBoard();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Not used
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Not used
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Not used
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Not used
    }
}