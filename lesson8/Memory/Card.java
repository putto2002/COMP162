
import javax.swing.*;
import java.awt.*;
import java.util.*;

/** A class representing a playing card*/
public class Card extends JLabel{


   private static ImageIcon backImage  = new ImageIcon("card_back.gif"); // the image for the back of all cards

   private ImageIcon frontImage;
   private boolean flipped;
   
   /** Calls JLabel's setIcon method to display the 'back of the card'
       as the starting default. Initialises this card's frontImage 
       using the parameter.
       @param icon this card's front image.
   */
   public Card( ImageIcon icon){
      super.setIcon(backImage);
      this.frontImage = icon;
   }
   
   
   /** Overrides JLabel's paintComponent method. NOTE - 
       no need to call super.paintComponent since background 
       colour not required.
   */
   public void paintComponent(Graphics g){
   
      if(flipped){
         
         frontImage.paintIcon(this, g, 0, 0);
      }else{
         
         backImage.paintIcon(this, g, 0, 0);
      }
   } 
   
   /** Returns the height of the current icon(The widths should of course be the same.
       @return the height of the currently displayed icon.
   */
   public int getHeight(){
      if(flipped){
         
         return frontImage.getIconHeight();
      }else{
         
         return backImage.getIconHeight();
      }
   }
   
   /** Returns the width of the current icon(The widths should of course be the same.
       @return the width of the currently displayed icon.
   */
   public int getWidth(){
      if(flipped){
         
         return frontImage.getIconWidth();
      }else{
         
         return backImage.getIconWidth();
      }
   }
   
   /** Toggles the flipped boolean*/
   public void flipCard(){
      flipped = !flipped;
   }
   
   public String toString(){
      return frontImage.getDescription();
   }

}