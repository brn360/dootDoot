import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.util.Random;

public class ManyWindows {
    JFrame frame;
    JLabel label;
    Thread thread1;
    //Toolkit tk = Toolkit.getDefaultToolkit();
    //Dimension screenSize = tk.getScreenSize();
    int width = 1024;
    int height = 768;
    int randomHeight;
    int randomWidth;
    
    public ManyWindows() {
        
        label = new JLabel("Doot Doot");
        thread1 = new Thread(new thread1Runner());
        thread1.start();
    }
    
    
    public class thread1Runner implements Runnable {
        public void run() {
            while (true) {
                frame = new JFrame("Doot Doot");
                frame.setSize(150, 75);
                frame.add(label);
                randomWidth = (int) (Math.random() * width);
                randomHeight = (int) (Math.random() * height);
                //frame.setLocation(randomWidth, randomHeight);
                frame.setLocation(randomWidth, randomHeight);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                try {
                thread1.sleep(500);
                }
                catch (Exception ex) {
                    
                }
            }
            
        }
    }
    
}
