package nl.bobvandervalk.SwingUIScaler4K;

import javax.swing.*;
import java.awt.*;

/**
 * This class is responsible for making the gui readable on a 4K screen with swing.
 *
 * I wrote this package because I have a 4K screen and it was hard to read my school assignments.
 * You can view this package on my Github page.
 *
 * @url http://github.com/bobvdvalk
 * @author Bob van der Valk
 * @version 1.0.0
 */
public class FrameScaler implements FrameScalerInterface {
    /**
     * Set a size of the application
     *
     * @param frame - JFrame object.
     * @param dimension - The width and height of the window to want to have.
     */
    @Override
    public void setSize(JFrame frame, Dimension dimension) {
        int width = (int) dimension.getWidth();
        int height = (int) dimension.getHeight();

        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

        int display_width = gd.getDisplayMode().getWidth();

        if(display_width < 1920) {
            frame.setSize(width, height);
        } else {
            int set_width = width * 3;
            int set_height = height * 3;

            frame.setSize(set_width, set_height);
        }
    }

    /**
     * Size a minimum size of the frame
     *
     * @param frame - Current JFrame that is loaded
     * @param dimension - Dimensions you want to set
     */
    @Override
    public void setMinimumSize(JFrame frame, Dimension dimension) {
        int width = (int) dimension.getWidth();
        int height = (int) dimension.getHeight();

        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

        int display_width = gd.getDisplayMode().getWidth();

        if(display_width > 1920) {
            frame.setMinimumSize(new Dimension(width, height));
        } else {
            int set_width = width * 3;
            int set_height = height * 3;

            frame.setMinimumSize(new Dimension(set_width, set_height));
        }
    }
}
