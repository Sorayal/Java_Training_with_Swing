package layoutmanager;

import javax.swing.*;
import java.awt.*;

// Root class
public class MainFrame extends JFrame {
    private JTextArea textArea;
    private JButton btn;

    // Constructs a new JFrame as toplevel element with fixed attributes
    // set also Layout and is used to add components like textarea or button
    // https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
    public MainFrame() {
        super("Hello World");
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn = new JButton("Click Me!");
        btn.setToolTipText("Test Tool Tip");

        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
