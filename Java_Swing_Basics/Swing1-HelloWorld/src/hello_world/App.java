package hello_world;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        // Anonymous Class /Can be replaced with Lambda
        // That is necessary if you want to update the frame from another thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create top level window
                JFrame frame = new JFrame("Hello World");

                // Set size
                frame.setSize(600, 500);

                // defines that program stops after the JFrame is closed.
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // By Default its not visible, so false.
                frame.setVisible(true);
            }
        });


/*        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hello World");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });*/
    }
}
