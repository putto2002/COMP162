package shapeApp;
/**
* Smiley class subclasses Shape (abstract)
* Smiley class is a representation of a smiley face
* @author Put Suthisrisinlpa
* @version 1.0, 2021
* @see Shape
 */
import java.awt.*;
public class Smiley extends Shape{

  /** contructor for Smiley class */
 public Smiley(){
   width = 30;
   height = 30;
   x = randomRange(0, 400) - width/2;
   y = randomRange(0, 400) - height/2;
 }

 /** display medthod is inherited from Shape (abstract) class.
  * display method displays smiley face as a Graphics object
  */
 public void display(Graphics g){
    g.setColor(Color.yellow);
    g.fillOval(x, y, width, height);
    g.setColor(Color.black);
    g.drawOval(x + 7, y + 8, 4, 4);
    g.drawOval(x + 20, y + 8, 4, 4);
    g.drawArc(x + 8, y + 10, 15, 13, 190, 160);
 
 }
}