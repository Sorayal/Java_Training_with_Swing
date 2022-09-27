package communication;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final JButton btn;
    private final TextPanel textPanel;
    private final Toolbar toolbar;


    // kind of controller
    public MainFrame() {
        super("Toolbars");

        setLayout(new BorderLayout());
        toolbar = new Toolbar();
        btn = new JButton("Click");
        textPanel = new TextPanel();

        // Connect Toolbar with TextPanel
        // The toolbar gets the reference of an instance of TextPanel
        toolbar.setTextPanel(textPanel);

        add(toolbar, BorderLayout.NORTH);
        add(btn, BorderLayout.SOUTH);
        add(textPanel, BorderLayout.CENTER);

        btn.addActionListener(actionEvent -> textPanel.appendText("Hello\n"));

        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
