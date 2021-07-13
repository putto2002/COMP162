public class AntApp {
    public static void main(String[] args){
        Ant blueAnt  = new Ant("Blue Ant", 9);
        Point[] points = { new Point(1, 4), new Point(3, 1), new Point(6, 4), new Point(4, 7), new Point(1, 6), new Point(3, 4), new Point(2, 1)};
        for (Point point: points){
             blueAnt.addPointVisited(point);
         }
        System.out.println(blueAnt.toString());
    
    }
    
}
