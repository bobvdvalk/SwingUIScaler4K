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
 */
public interface FrameScalerInterface {
    /**
     * Set a size of the application
     *
     * @param frame - JFrame object.
     * @param dimension - The width and height of the window to want to have.
     */
    void setSize(JFrame frame, Dimension dimension);

    /**
     *
     * @param frame - Current JFrame Object
     * @param dimension - The width and height of the window to want to have.
     */
    void setMinimumSize(JFrame frame, Dimension dimension);
}
