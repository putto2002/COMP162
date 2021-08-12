
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/** A panel containing a control panel (for buttons) and a display panel on which Card objects are displayed*/
public class MemoryGamePanel extends JPanel{

  
   JLabel c;
   String[] imageNames = {"bus.gif", "plane.gif", "train.gif", "satellite.gif",
                       "house.gif","ship.gif", "satellite.gif", "plane.gif",
                       "bus.gif", "train.gif", "ship.gif", "house.gif"};
   Card[] cards = new Card[imageNames.length];
   DisplayPanel dP;

   public MemoryGamePanel(){
      JPanel controlPanel = new JPanel();
      
      JButton shuffleButton = new JButton("Shuffle Cards");
      shuffleButton.addActionListener(new ButtonListener());
      
      
      CardListener cL = new CardListener();
      for(int i = 0; i< cards.length;i++){ 
         cards[i] = new Card(new ImageIcon(imageNames[i])); 
         cards[i].addMouseListener(cL); 
      }
      
      
      dP = new DisplayPanel(); // Size of displayPanel is dependent on width of cards 
                               // so cards must all be instantiated FIRST!
                               
      for(int i = 0; i< cards.length;i++){ 
         dP.add(cards[i]);
      } 
      
      controlPanel.add(shuffleButton);
      controlPanel.setPreferredSize(new Dimension(120, 3 * cards[0].getHeight() + 4 * 30));
      controlPanel.setBackground(Color.blue);
                              
      this.add(controlPanel);
      this.add(dP);
   }
  
   /** The panel on which the cards will be displayed. The size 
       has been calculated to fit a 3 by 4 grid of Card objects.
   */
   private class DisplayPanel extends JPanel{
      public DisplayPanel(){
         
         this.removeAll();
         setBackground(Color.orange); 
         
         int gap = 30;
         setPreferredSize(new Dimension(4 * cards[0].getWidth() + 5 * gap, 3 * cards[0].getHeight() + 4 * gap)); 
         FlowLayout fl = new FlowLayout(FlowLayout.CENTER, gap, gap);
         setLayout(fl);
      }
      
   
   }
   
   /** The class that responds to button presses*/
   private class ButtonListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
         Random r = new Random();
         dP.removeAll();

         
         
            for(int i = 0; i < cards.length; i++){
               int randomIndex = r.nextInt(cards.length - 1);
               Card temp = cards[randomIndex];
               cards[randomIndex] = cards[i];
               cards[i] = temp;
            }
            
            
            for(int i = 0; i< cards.length;i++){ 
               dP.add(cards[i]);
            } 
            
         
         
         

         
         
//          Write code here to shuffle the order of the cards array
//          
//          Add each card to the DisplayPanel, dP.
         
         dP.revalidate();//important - needed!
         dP.repaint();
      
      }
   
   }
   
   
                               
   /** The class that responds to mouse clicks. Only the mousePressed method 
     * actually does anything. The other methods must be present to meet the 
     * requirements of MouseListener*/                 
   public class CardListener implements MouseListener{
    
      /** Invoked when the mouse button has been clicked 
      * (pressed and released) on a component.*/
      public void mouseClicked(MouseEvent e){}
      /** Invoked when the mouse enters a component. */       
      public void  mouseEntered(MouseEvent e){}
      
      /** Invoked when the mouse exits a component. */     
      public void  mouseExited(MouseEvent e){}
      
      /** Invoked when a mouse button has been pressed on a component. */      
      public void  mousePressed(MouseEvent e){
         Card c = (Card)e.getSource();
         c.flipCard();
         c.repaint();
      }
      
      /** Invoked when a mouse button has been released on a component.*/  
      public void mouseReleased(MouseEvent e){
         
      } 
   } 
    
}
 
 

