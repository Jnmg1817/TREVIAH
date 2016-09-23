package trivial2;

  
import java.awt.Color;

import javax.swing.JFrame;

public class FreeHandDrwing 
    {
        public static void main(String s[])
        {
            Frame4 ob=new Frame4();
            
            ob.setBackground(Color.WHITE);
            ob.setVisible(true);
            ob.setBounds(100, 100, 1200, 500);
            ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
