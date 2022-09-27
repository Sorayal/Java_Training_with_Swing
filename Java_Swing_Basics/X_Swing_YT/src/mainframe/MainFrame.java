package mainframe;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        this.setTitle("JFrame title");
        this.setSize(420, 420);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        ImageIcon image = createImageIcon("plane_logo.png", "Java");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123, 50, 250));
    }

    private static ImageIcon createImageIcon(String path,
                                             String description) {
        java.net.URL imgURL = MainFrame.class.getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
