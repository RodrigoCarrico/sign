import javax.swing.*;

public class Main {

    public static void  main(String[] args) throws Exception {
        JFrame frame = new JFrame("Assinador");
        frame.setContentPane(new FormAssinatura().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



}
