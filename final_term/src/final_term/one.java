package final_term;

import java.awt.*;
import javax.swing.*;


 
public class one extends JFrame {
    public one() {
        this.setTitle("10¹ø ¹®Á¦");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        Container c= getContentPane();
        
        c.setBackground(Color.YELLOW);
        
        Thread t = new Thread(new TimmerRunnable());
        t.start();
        
        this.setSize(250, 150);
        this.setVisible(true);
    }
    
    public class TimmerRunnable implements Runnable{
        public void run() {
            
            try {
                Thread.sleep(10000);
            }
            catch(InterruptedException e) { return; }
            
            getContentPane().setBackground(Color.BLUE);
        }
    }
    
    public static void main(String[] args) {
        new one();
    }
}

