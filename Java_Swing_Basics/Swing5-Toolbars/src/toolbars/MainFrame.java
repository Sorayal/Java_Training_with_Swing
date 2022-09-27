package toolbars;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final JButton btn;
    private final TextPanel panel;
    private final Toolbar toolbar;

    public MainFrame() {
        super("Toolbars");

        setLayout(new BorderLayout());
        toolbar = new Toolbar();
        btn = new JButton("Click");
        panel = new TextPanel();
        add(toolbar, BorderLayout.NORTH);
        add(btn, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);

        btn.addActionListener(actionEvent -> panel.appendText("Hello\n"));

        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
