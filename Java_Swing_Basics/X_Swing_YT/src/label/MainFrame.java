package label;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setSize(500, 500);
        setLocationRelativeTo(null); // Sets it to the center of the screen
        //setLayout(null); // if null then the Label needs setBounds Method to specify the position and the size
        setVisible(true);
        initComponent();
        pack(); //without Layout Manager, Size and setBorder for Label it fits the size of the window
        // to the components
    }

    private void initComponent(){
        // JLabel = a GUI display area for a string of text, an image, or both
        JLabel label = new JLabel(); //creates an instance of a label
        label.setText("Bro, do you even code?"); // set text of label
        label.setForeground(new Color(0x9A0000)); // sets fontcolor with hex value to red
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); // This set the font of the text
        label.setIconTextGap(-10); // set gap of text to image
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // must be set if background color should be changed , display blackground color
        ImageIcon icon = new ImageIcon("plane_logo.png"); // icon needs to be in root folder of project
        // ImageIcon icon = createImageIcon("plane_logo.png", "Plane");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon and text within the label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon and text within the label
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM

        // set x, y position within frame as well as dimensions
        //label.setBounds(100,100,250,250); // sets Label to top left with 0,0
        add(label); // adds label to Mainframe
    }

    // Gets the absolute path of the icon
    private static ImageIcon createImageIcon(String path,
                                             String description) {
        java.net.URL imgURL = mainframe.MainFrame.class.getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
