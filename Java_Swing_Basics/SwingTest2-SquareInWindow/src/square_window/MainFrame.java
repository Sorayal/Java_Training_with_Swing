package square_window;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        super("Square in window");

        // x and y gives start position, width and height defines window size
        setBounds(800,200,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Component MyPanel added
        add(new MyPanel());
        setVisible(true);
    }
}
