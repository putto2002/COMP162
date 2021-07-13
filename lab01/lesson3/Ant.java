import java.text.DecimalFormat;
public class Ant {
    private String antId;
    private Point[] journey;

    public Ant(){}

    public Ant(String id, int numPoints){
        this.antId = id;
        this.journey = new Point[numPoints];
        this.journey[0] = new Point(0, 0);
        this.journey[this.journey.length - 1] = new Point(0, 0);
    }
    
    public void getJourney(){
     for(int i = 0; i < journey.length; i++){
       System.out.println(journey[i].getX());
     }
    }

    public String getId(){
        return this.antId;
    }

    public void setId(String id){
        this.antId = id;
    }

    public double getDistanceTravelled(){
        double distanceTravelled = 0;
        for (int i = 1; i < this.journey.length; i++){
            distanceTravelled += Point.distanceBetweenTwoPoints(this.journey[i - 1], this.journey[i]);

        }

        return distanceTravelled;
    }

    public void addPointVisited(Point p){
        for(int i = 0; i < journey.length; i ++){
            if(journey[i] == null){
                journey[i] = p;
                break;
            }
        }
    }
    
    public double getShortestLeg() {
       double shortestLeg = Point.distanceBetweenTwoPoints(journey[0], journey[1]);
       for(int i = 2; i < journey.length; i++){
           double currentLeg = Point.distanceBetweenTwoPoints(journey[i], journey[i - 1]);
           if(currentLeg < shortestLeg){
               shortestLeg = currentLeg;
           }
          
       }
       return shortestLeg;
    
    }
    
    public double getLongestLeg(){
        double longestLeg = Point.distanceBetweenTwoPoints(journey[0], journey[1]);
        for(int  i = 2; i < this.journey.length; i++){
            double currentLeg = Point.distanceBetweenTwoPoints(journey[i], journey[i - 1]);
            if (currentLeg > longestLeg){
                longestLeg = currentLeg;
            }
        }
        
        return longestLeg;
    }

    public String toString(){
        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(3);

        return "Details for: " + this.antId + "\nShortest Leg: " + format.format(this.getShortestLeg()) + "\nLongest Leg: " + format.format(this.getLongestLeg()) +  "\nTotal Distance: " + format.format(this.getDistanceTravelled());
    }


    
}
