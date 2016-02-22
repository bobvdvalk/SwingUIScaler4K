package nl.bobvandervalk.Example;

import nl.bobvandervalk.SwingUIScaler4K.FrameScaler;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Bob on 3-2-2016.
 */
public class Example extends JFrame {
    public static void main(String... args) {

        JFrame frame = new Example();

        //frame.setSize(400, 200);
        FrameScaler frameScaler = new FrameScaler();
        frameScaler.setSize(frame, new Dimension(400, 200));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Example SwingUIScaler4K");
        JPanel panel = new MainPanel();
        frame.setContentPane(panel);


        frame.setVisible(true);
    }
}
