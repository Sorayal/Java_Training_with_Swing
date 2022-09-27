package helloworld;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton buttonMessage;
    private JPanel panelMain;
    private JTextPane textPane1;

    public App() {
        buttonMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World");
            }
        });
    }

//    public App() {
//        buttonMessage.addActionListener(actionEvent -> JOptionPane.showMessageDialog(null, "Hello World"));
//    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("App");
        jFrame.setContentPane(new App().panelMain);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
