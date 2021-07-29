package shapeApp;
/**
* Square class subclasses Shape (abstract)
* Square class is a representation of a square
* @author Put Suthisrisinlpa
* @version 1.0, 2021
* @see Shape
 */
import java.awt.*;
public class Square extends Shape{

   /** display medthod is inherited from Shape (abstract) class.
  * display method displays square as a Graphics object
  */
 public void display(Graphics g){
   g.setColor(this.color);
   g.fillRect(this.x, this.y, this.width, this.height);
   
 }
}