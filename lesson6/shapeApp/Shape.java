package shapeApp;
/** 
* An abstract representation of a shape
* @author Put Suthisrisinlpa
* @version 1.0, 2021
**/
import java.awt.*;
import java.util.*;
public abstract class Shape {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected Color color;
    protected char directionX;
    protected char directionY;
    
    /** Contructure of a shape
     */
    public Shape() {

        this.width = randomRange(10, 30);
        this.height = this.width;
        this.x = randomRange(0, 400) - this.width;
        this.y = randomRange(0, 400) - this.height;
        this.color = new Color(randomRange(0, 255), randomRange(0, 255), randomRange(0, 255));
        this.directionX = 'R';
        this.directionY = 'D';
    }

    
    /**
    @param lo lower limit of the random range
    @param hi higher limit of the random range
    @return a random integer between lo and hi
    */
    public static int randomRange(int lo, int hi){
        Random r = new Random();
        return r.nextInt(hi - lo + 1) + lo;

    }
    

    /**
    move medthod increments or decrements the x and y value and change directions depending on the location of the shape.
     */
    public void move() {
       if(this.x >= 400 - this.width){
         this.directionX = 'L';
       }else if(this.x <= 0) {
          this.directionX = 'R';
       }
       if(this.directionX == 'L'){
          this.x--;
       }else {
           this.x++;
       }
       if(this.y >= 400 - this.height){
           this.directionY = 'U';
       } else if(this.y <=  0){
           this.directionY = 'D';
       }
       
       if(this.directionY == 'U'){
           this.y--;
       } else {
           this.y++;
       }
        
      }
      

      /** an abstract method displays shapes as a Grapics object
       * @param Graphics object
 */
   public abstract void display(Graphics g);
    
}