package custom_components;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JButton btn;
    private TextPanel textPanel;

    public MainFrame() {
        super("Custom Components");

        setLayout(new BorderLayout());
        btn = new JButton("Click me!");
        textPanel = new TextPanel();
        add(btn, BorderLayout.SOUTH);
        add(textPanel, BorderLayout.CENTER);

        btn.addActionListener(actionEvent -> textPanel.appendText("Hello!\n"));

        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
