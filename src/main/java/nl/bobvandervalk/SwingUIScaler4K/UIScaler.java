package nl.bobvandervalk.SwingUIScaler4K;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

/**
 * This class is responsible to set a font and a resizable font size
 *
 * @author Bob van der Valk
 */
public class UIScaler implements UIScalerInterface {
    /**
     * Set font and font size of your application
     *
     * @param font - Name of your font
     * @param size - Size for default computers (not 4K)
     */
    public void setFontSize(String font, int size) {

        FontUIResource fontUiRes = new FontUIResource(font, Font.PLAIN, calculateSize(size));

        // Ugly I know
        UIManager.put("Button.font", fontUiRes);
        UIManager.put("ToggleButton.font", fontUiRes);
        UIManager.put("RadioButton.font", fontUiRes);
        UIManager.put("CheckBox.font", fontUiRes);
        UIManager.put("ColorChooser.font", fontUiRes);
        UIManager.put("ComboBox.font", fontUiRes);
        UIManager.put("Label.font", fontUiRes);
        UIManager.put("List.font", fontUiRes);
        UIManager.put("MenuBar.font", fontUiRes);
        UIManager.put("MenuItem.font", fontUiRes);
        UIManager.put("RadioButtonMenuItem.font", fontUiRes);
        UIManager.put("CheckBoxMenuItem.font", fontUiRes);
        UIManager.put("Menu.font", fontUiRes);
        UIManager.put("PopupMenu.font", fontUiRes);
        UIManager.put("OptionPane.font", fontUiRes);
        UIManager.put("Panel.font", fontUiRes);
        UIManager.put("ProgressBar.font", fontUiRes);
        UIManager.put("ScrollPane.font", fontUiRes);
        UIManager.put("Viewport.font", fontUiRes);
        UIManager.put("TabbedPane.font", fontUiRes);
        UIManager.put("Table.font", fontUiRes);
        UIManager.put("TableHeader.font", fontUiRes);
        UIManager.put("TextField.font", fontUiRes);
        UIManager.put("PasswordField.font", fontUiRes);
        UIManager.put("TextArea.font", fontUiRes);
        UIManager.put("TextPane.font", fontUiRes);
        UIManager.put("EditorPane.font", fontUiRes);
        UIManager.put("TitledBorder.font", fontUiRes);
        UIManager.put("ToolBar.font", fontUiRes);
        UIManager.put("ToolTip.font", fontUiRes);
        UIManager.put("Tree.font", fontUiRes);
    }

    public int calculateSize(int size) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

        int display_width = gd.getDisplayMode().getWidth();

        if(display_width < 1920) {
            return size;
        } else {
            double current = size * 2.3;
            return (int) current;
        }
    }
}
