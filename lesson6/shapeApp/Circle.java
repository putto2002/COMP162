package shapeApp;
/**
* Circle class subclasses Shape (abstract)
* Circle class is a representation of a circle
* @author Put Suthisrisinlpa
* @version 1.0, 2021
* @see Shape
 */
import java.awt.*;
public class Circle extends Shape{
    /** display medthod is inherited from Shape (abstract) class.
  * display method displays circle as a Graphics object
  */
 public void display(Graphics g){
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.width, this.height);
        
    }



}