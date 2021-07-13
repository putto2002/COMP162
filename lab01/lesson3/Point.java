public class Point {
    private int x;
    private int y;
    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }

    public double distanceToOtherPoint(Point p){
        return  Math.sqrt(Math.pow((this.getX() - p.getX()), 2) + Math.pow(this.getY() - p.getY(), 2));
    }

    public static double distanceBetweenTwoPoints(Point p1, Point p2){
        return Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2)); 
    }

    public String toString(){
        return "x: " + this.x + " y: " + this.y;
    }
    
}
