package actionlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JButton btn = new JButton("Click me!");
    private JTextArea textArea = new JTextArea();
    MainFrame(){
        super("hello");

        setLayout(new BorderLayout());

        add(textArea,BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        // adds an ActionListener to listen if the button is clicked
        // and what should happen then.
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea.append("Hello universe\n");
            }
        });

        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
