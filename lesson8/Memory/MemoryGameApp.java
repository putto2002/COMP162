
import javax.swing.*;
import java.awt.*;



public class MemoryGameApp{

   public static void main(String[]args){
      JFrame frame = new JFrame("Memory Game"); //creates a new JFrame with a title
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// Allows us to close the window
      frame.setLayout(new FlowLayout());// Not technically necessary at this stage
      MemoryGamePanel panel1 = new MemoryGamePanel();// Creates a new instance of our main panel
      frame.getContentPane().add (panel1);// adds the panel to the JFrame
      frame.pack(); // forces the JFrame to expand to accomodate the panel - try commenting this line out
      frame.setVisible(true);// pretty much what it says - try commenting this line out 
   }
}



