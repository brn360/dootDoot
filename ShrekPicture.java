import java.awt.*;
import javax.swing.*;

public class ShrekPicture extends JPanel {
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon(getClass().getResource("Shrek-dance-o.gif")).getImage();
        g.drawImage(image, 3, 4, this);
    }
}
