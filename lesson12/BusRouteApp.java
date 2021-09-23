
/**
* An application class to help you test your BusRoute class
* @author Nick Meek
*/
public class BusRouteApp{

   
   public static void main(String[] args){
   
      //Some test data
      BusRoute route = new BusRoute("St Clair - City");
      route.addStop("St Clair Terminus", 0, 120, true, null);
      route.addStop("Forbury Rd, 232", 120, 60, true, "St Clair Terminus");
      route.addStop("Forbury Rd, 198", 60, 60, true, "Forbury Rd, 232");
      route.addStop("Forbury Rd, 160", 60, 60, true, "Forbury Rd, 198");
      route.addStop("Forbury Rd, 94", 60, 60, true, "Forbury Rd, 160");
      route.addStop("Macandrew Rd, 282", 60, 45, true, "Forbury Rd, 94");
      route.addStop("Macandrew Rd, 252", 45, 60, true, "Macandrew Rd, 282");
      route.addStop("Macandrew Rd, 240", 60, 30, true, "Macandrew Rd, 252");
      route.addStop("Macandrew Rd opposite Kirkcaldy St", 30, 60, true, "Macandrew Rd, 240");
      route.addStop("Macandrew Rd, 154", 60, 60, true, "Macandrew Rd opposite Kirkcaldy St");
      route.addStop("Macandrew Rd, 122", 60, 60, true, "Macandrew Rd, 154");
      route.addStop("King Edward St, 275", 60, 60, true, "Macandrew Rd, 122");
      route.addStop("King Edward St, 135", 60, 120, true, "King Edward St, 275");
      route.addStop("King Edward St, 19", 120, 60, true, "King Edward St, 135");
      route.addStop("Princes St, opposite Jean McLean Pavilion", 60, 45, true, "King Edward St, 19");
      route.addStop("Princes St, Go Bus Depot", 45, 60, true, "Princes St, opposite Jean McLean Pavilion");
      route.addStop("Princes St, cnr Manor Pl", 60, 60, true, "Princes St, Go Bus Depot");
      route.addStop("Princes St, 398", 60, 60, true, "Princes St, cnr Manor Pl");
      route.addStop("Princes St, 300", 60, 120, true, "Princes St, 398");
      route.addStop("Princes St, 138", 120, 300, true, "Princes St, 300");
      route.addStop("Bus Hub Stop D", 300, 0, true, "Princes St, 138");

     
    System.out.println(route.secondsBetweenStops("St Clair Terminus", "Bus Hub Stop D"));
    route.suspendStop("Forbury Rd, 232");
    route.suspendStop("Princes St, 138");
    System.out.println(route);

    route.activateStop("Princes St, 138");
    System.out.println(route);
         }
       

    
}
