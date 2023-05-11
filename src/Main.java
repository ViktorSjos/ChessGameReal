import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {



        Logic log = new Logic();
        MyFrame frame = new MyFrame(log);
        frame.repaint();

    }
}