package test;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class SecondPanel extends JPanel {
    private JTextArea textArea1;
    private JPanel secondPanel;
    private JButton TestButton;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        secondPanel = new JPanel();
        secondPanel.setLayout(new BorderLayout(0, 0));
        secondPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        textArea1 = new JTextArea();
        secondPanel.add(textArea1, BorderLayout.CENTER);
        TestButton = new JButton();
        TestButton.setText("Check");
        secondPanel.add(TestButton, BorderLayout.SOUTH);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return secondPanel;
    }
}
