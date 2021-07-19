import java.awt.*;
import java.util.*;
public class Shape {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Shape() {

        this.width = randomRange(10, 30);
        this.height = this.width;
        this.x = randomRange(0, 400) - this.width;
        this.y = randomRange(0, 400) - this.height;
        this.color = new Color(randomRange(0, 255), randomRange(0, 255), randomRange(0, 255));


    }

    

    public static int randomRange(int lo, int hi){
        Random r = new Random();
        return r.nextInt(hi - lo + 1) + lo;

    }

    public void display(Graphics g){
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.width, this.height);
        
    }


    
}
