package mainframe;

import mainframe.MainFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);

/*        // JFrame = a toplevel GUI window to add components to
        JFrame frame = new JFrame(); // this creates a frame
        frame.setTitle("JFrame title"); // sets title of frame
        frame.setSize(420,420); // sets the x-dimension and the y-dimension of frame
        frame.setResizable(false); // prevents from resizing the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what should happen when exit out of application
        frame.setVisible(true); // makes frame visible

        //ImageIcon image = new ImageIcon("plane_logo.png", "Plane"); // creates an image icon
        ImageIcon image = createImageIcon("plane_logo.png", "Java");
        frame.setIconImage(image.getImage()); // change icon of the frame
        frame.getContentPane().setBackground(Color.GREEN); // change color of background
        // frame.getContentPane().setBackground(new Color(0,0,0)); //black //red , green, blue
        // frame.getContentPane().setBackground(new Color(255,255,255)); //white
        frame.getContentPane().setBackground(new Color(123,50,250));*/
    }

    // Returns an ImageIcon, or null if the path was invalid.
/*    private static ImageIcon createImageIcon(String path,
                                             String description) {
        java.net.URL imgURL = Main.class.getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }*/
}
