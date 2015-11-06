import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class ShrekWindows{
    JFrame frame;
    ShrekPicture picture = new ShrekPicture();;
    Thread thread1;
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    int width = screenSize.width;
    int height = screenSize.height;
    int randomHeight;
    int randomWidth;
    
    public ShrekWindows() {
        thread1 = new Thread(new thread1Runner());
        thread1.start();
    }
    

    
    
    
    public class thread1Runner implements Runnable, KeyListener {
        public void run() {
            while (true) {
                frame = new JFrame("Doot Doot");
                frame.addKeyListener(this);
                frame.setSize(320,180);
                frame.add(picture);
                randomWidth = (int) (Math.random() * width);
                randomHeight = (int) (Math.random() * height);
                //frame.setLocation(randomWidth, randomHeight);
                frame.setLocation(randomWidth, randomHeight);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                try {
                thread1.sleep(100);
                }
                catch (Exception ex) {
                    
                }
            }
            
        }
        
        public void keyPressed(KeyEvent key) {
        
        }
    
        public void keyReleased(KeyEvent txt) {
        //do nothing
        }
    
        public void keyTyped(KeyEvent key) {
            char magic = key.getKeyChar();
            if (magic == 'c') {
                System.exit(0);
            }
        }
    }
    
}
