package nl.bobvandervalk.SwingUIScaler4K;

/**
 * This class is responsible to set a font and a resizable font size
 *
 * @author Bob van der Valk
 */
public interface UIScalerInterface {
    /**
     * Set font and font size of your application
     * @param font - Name of your font
     * @param size - Size for default computers (not 4K)
     */
    void setFontSize(String font, int size);
}
