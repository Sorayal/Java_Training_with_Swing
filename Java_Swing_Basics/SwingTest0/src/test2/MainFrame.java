package test2;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    MainFrame(){
        super("Hello Root Element");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Create a panel and add components
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createDashedBorder(Color.RED));
        contentPanel.setBackground(Color.YELLOW);
        setContentPane(contentPanel);
    }
}
