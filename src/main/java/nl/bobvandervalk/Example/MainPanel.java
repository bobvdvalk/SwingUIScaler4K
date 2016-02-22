package nl.bobvandervalk.Example;

import nl.bobvandervalk.SwingUIScaler4K.UIScaler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bob on 20-2-2016.
 */
public class MainPanel extends JPanel {
    private JButton button1, button2, button3;
    private JTextField textField;
    private JLabel label;

    /**
     * Creates a new <code>JPanel</code> with a double buffer
     * and a flow layout.
     */
    public MainPanel() {
        UIScaler uiScaler = new UIScaler();
        uiScaler.setFontSize("Arial", 12);

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");


        label = new JLabel("This is a test");

        button1.addActionListener(new Btn1Handler());
        button2.addActionListener(new Btn2Handler());
        button3.addActionListener(new Btn3Handler());

        textField = new JTextField(20);

        add(button1);
        add(button2);
        add(button3);
        add(textField);
        add(label);
    }

    private class Btn1Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("Button 1 is pressed");
        }
    }

    private class Btn2Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("Button 2 is pressed");
        }
    }

    private class Btn3Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("Button 3 is pressed");
        }
    }
}
