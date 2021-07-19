import java.awt.*;
import java.util.*;
public class Shape {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    private char directionX;
    private char directionY;

    public Shape() {

        this.width = randomRange(10, 30);
        this.height = this.width;
        this.x = randomRange(0, 400) - this.width;
        this.y = randomRange(0, 400) - this.height;
        this.color = new Color(randomRange(0, 255), randomRange(0, 255), randomRange(0, 255));
        this.directionX = 'R';
        this.directionY = 'D';


    }

    

    public static int randomRange(int lo, int hi){
        Random r = new Random();
        return r.nextInt(hi - lo + 1) + lo;

    }
    
    public void move() {
       if(this.x >= 400 - this.width){
         this.directionX = 'L';
       }else if(this.x <= 0 - this.width) {
          this.directionX = 'R';
        
       }
       
       if(this.directionX == 'L'){
          this.x--;
       }else {
           this.x++;
       }
       
       
       if(this.y >= 400 - this.height){
           this.directionY = 'U';
       } else if(this.y <= 0 - this.height){
           this.directionY = 'D';
       }
       
       if(this.directionY == 'U'){
           this.y--;
       } else {
           this.y++;
       }
        
      }

    public void display(Graphics g){
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.width, this.height);
        
    }


    
}