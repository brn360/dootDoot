//Importing all necessary packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//Declaring the main class
public class ShrekDootDoot extends JFrame implements ActionListener{
    //MakeQuadEqWork Quad = new MakeQuadEqWork(this);
    
    //Setting up the first row with 2 buttons
    JPanel row1 = new JPanel();
    JButton dootdoot = new JButton("G3T SHR3KT");
    //Creating the frame of the gui and adding everything to it
    
    public ShrekDootDoot() {
        setSize(100,160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(4,0);
        setLayout(grid);
        setResizable(false);
        
        //I will add listeners here at some point
        dootdoot.addActionListener(this);

        


        
        //Adding row1 to the frame
        FlowLayout flo = new FlowLayout(FlowLayout.CENTER);
        row1.add(dootdoot);
        add(row1);
        
        //Making it all visible
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent event) {
        ShrekWindows windows = new ShrekWindows();
    }
    
    
    //My main method
    public static void main(String[] args) {
        ShrekDootDoot frame = new ShrekDootDoot();
        
    }
    
}
