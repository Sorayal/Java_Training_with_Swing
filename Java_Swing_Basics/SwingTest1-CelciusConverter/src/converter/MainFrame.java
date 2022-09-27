package converter;

import javax.swing.*;

public class MainFrame extends JFrame {

    private JTextField textfield;

    public MainFrame() {
        super("Celsius Converter");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();

    }

    // https://docs.oracle.com/javase/tutorial/uiswing/learn/adjustinggui.html

    // TODO: Finish Converter and build logic
    private void initComponents() {
        JPanel panel = new JPanel();
        JTextField textfield = new JTextField();
        JLabel celsius = new JLabel("Celsius");
        JLabel fahrenheit = new JLabel("Fahrenheit");
        JButton convert = new JButton("Convert");
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(textfield)
                                .addComponent(celsius))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(convert)
                                .addComponent(fahrenheit)
                        )
        );
    }
}
