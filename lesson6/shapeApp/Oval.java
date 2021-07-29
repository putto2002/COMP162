package shapeApp;
/**
* Oval class subclasses Shape (abstract)
* Oval class is a representation of an oval
* @author Put Suthisrisinlpa
* @version 1.0, 2021
* @see Shape
 */
import java.awt.*;

public class Oval extends Shape{
   /** construct for Oval class */
   public Oval(){
      height = width * 4;
      y = randomRange(0, 400) - height;
   
   }

    /** display medthod is inherited from Shape (abstract) class.
  * display method displays oval as a Graphics object
  */
   public void display(Graphics g){
     g.setColor(color);
     g.fillOval(x, y, width, height);
   }
}