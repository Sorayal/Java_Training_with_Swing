package converter;

import javax.swing.*;

public class MainFrame extends JFrame {

    private JTextField textfield;
    private JPanel panel;
    private JLabel celsius;
    private JLabel fahrenheit;
    private JButton convert;


    public MainFrame() {
        super("Celsius Converter");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
        add(textfield);
        add(panel);
        add(celsius);
        add(fahrenheit);
        add(convert);
        pack();
    }

    // https://docs.oracle.com/javase/tutorial/uiswing/learn/adjustinggui.html

    // TODO: Finish Converter and build logic
    private void initComponents() {
        this.panel = new JPanel();
        this.textfield = new JTextField();
        this.celsius = new JLabel("Celsius");
        this.fahrenheit = new JLabel("Fahrenheit");
        this.convert = new JButton("Convert");
        GroupLayout layout = new GroupLayout(panel);
        this.panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                //.addComponent(textfield)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING))
        );
        /*
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

         */
    }
}
