package jpanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(750, 750);
        setLayout(null);
        setVisible(true);
        initComponent();
    }

    private void initComponent(){

        ImageIcon icon = new ImageIcon("thumbsup.jpg");
        JLabel label = new JLabel("Hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100,100,75,75);

        // JPanel = a GUI component that functions as a container to hold other components
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);
        redPanel.add(label);
        add(redPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        add(bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout()); // moves the components now to the left center and can be aligned
        //greenPanel.add(label);
        add(greenPanel);

    }
}
