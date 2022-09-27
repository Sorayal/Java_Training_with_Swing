package test;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private final JTextArea textArea;

    public TextPanel() {
        textArea = new JTextArea();
        setLayout(new BorderLayout());
        //textArea.setFont(textArea.getFont().deriveFont(Font.ITALIC));
        textArea.setFont(new Font("Monaco", Font.BOLD, 20));
        add(textArea, BorderLayout.CENTER);
    }

    public void appendText(String text) {
        textArea.append(text);
    }
}
