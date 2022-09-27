package communication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {
    private JButton helloButton;
    private JButton goodbyeButton;
    private TextPanel textPanel;

    public Toolbar() {
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Goodbye");
        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(helloButton);
        add(goodbyeButton);
    }

    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //System.out.println("button clicked");
        // which button is clicked
        JButton clicked = (JButton) actionEvent.getSource();
        if (clicked == helloButton) {
            textPanel.appendText("Hello\n");
            //System.out.println("Hello");
        } else {
            //System.out.println("Goodbye");
            textPanel.appendText("Goodbye\n");
        }
    }
}
