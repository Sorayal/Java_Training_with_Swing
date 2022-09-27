package test;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final TextPanel panel;
    private final JButton btn;
    private final SecondPanel secondPanel;

    MainFrame() {
        super("Test");

        setLayout(new BorderLayout());
        btn = new JButton("Click");
        panel = new TextPanel();
        secondPanel = new SecondPanel();
        add(secondPanel, BorderLayout.EAST);
        add(btn, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);
        btn.addActionListener(actionEvent -> panel.appendText("Hello Universe\n"));

        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
