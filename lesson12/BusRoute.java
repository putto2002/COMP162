import java.util.*;

/**
* A class to represent and manage a busRoute which is comprised of a number of BusStops
* and provide information about the time between any pair of BusStops
* @author Nick Meek
*/
public class BusRoute{
   private String routeId;
   public BusStop busRoute; // the most west stop or the head stop
    
    /** Default constructor */
   public BusRoute(){};
    
    /**
    * Constructor
    * @param routeId The unique identifier for this bus route
    */
   public BusRoute(String routeId){
      this.routeId = routeId;
   }
    
    /**
    * A method to set (or change) the route id
    * @param routeId The unique identifier for this bus route
    */   
   public void setRouteId(String routeId){
      this.routeId = routeId;
   }
    
    
    /**
    * A method to add a new BusStop immediately after (to the East) 
    * of the BusStop with the specified id
    * @param stopId The unique identifies for this bus Stop
    * @param secsToNextStopEast How many seconds to the next (inService) bus Stop going East
    * @param secsToNextStopWest How many seconds to the next (inService) bus Stop going West
    * @param inService Is this bus Stop currently in use
    * @param previousStopId The id of the stop to the West of where the new stop should be added. 
    * If this is the first stop in the route this will be null.
    */ 
   public void addStop(String stopId, int secsToNextStopWest, int secsToNextStopEast, boolean inService, String previousStopId){
      BusStop newStop = new BusStop(stopId, secsToNextStopWest, secsToNextStopEast, inService);
      if(busRoute == null){
         busRoute = newStop;
         return;
           // the westPtr and east will be null initially
      }
      BusStop current = busRoute;
      while(current != null){
         if(current.stopId == previousStopId){
            newStop.eastPtr = current.eastPtr;
            current.eastPtr = newStop;
            newStop.westPtr = current;
            return;
               
         }
         current = current.eastPtr;
      }
   
   
   }
    
    /** A method to remove the BusStop with the specified id.
    * @param busStopId the id of the BusStop to remove
    */
   public void removeStop(String busStopId){
      BusStop current = busRoute;
      while(current != null){
         if(current.stopId.equals(busStopId)){
           
            current.westPtr.eastPtr = current.eastPtr;
            current.eastPtr.westPtr = current.westPtr;
            return;
         }
         current = current.eastPtr;
      }
   }
    
    /** A method to suspend the BusStop with the specified id.
    * @param busStopId the id of the BusStop to suspend
    */
   public void suspendStop(String busStopId){
      BusStop current = busRoute;
      while(current != null){
         if(current.stopId.equals(busStopId)){
            current.inService = false;
            return;
         }
      
         current = current.eastPtr;
      }
   }
    
    /** A method to activate the BusStop with the specified id.
    * @param busStopId the id of the BusStop to activate
    */
   public void activateStop(String busStopId){
      BusStop current = busRoute;
      while(current != null){
         if(current.stopId.equals(busStopId)){
            current.inService = true;
            return;
         }
      
         current = current.eastPtr;
      }
   }
 
    /** A method to calculate the time to travel between two BusStops
    * The distance is strictly from busStop1 to busStop2 even if that means
    * going to the end of the route and then going back in the other direction.
    * Turn-around time for busses calculated as 0 seconds.
    * @param busStop1 the id of the first BusStop
    * @param busStop2 the id of the second BusStop
    * @return int The number of seconds between two BusStops
    */

    // meant to be int
   public int secondsBetweenStops(String busStop1, String busStop2){
     
      BusStop current = busRoute;
   
      char direction = 'E';
   
   
      while(current != null && !(current.stopId.equals(busStop1))){
         current = current.eastPtr;
      }
          
   
      
   
      int timeTraveled = 0; 
   
      while(current != null){
      
      
      
         if(current.eastPtr == null){
            direction = 'W';
         } 
         if(direction == 'E'){
            if(current.eastPtr.stopId.equals(busStop2)){
               timeTraveled += current.secsToNextStopEast;
               break;
            }
            timeTraveled += current.secsToNextStopEast;
            current = current.eastPtr;
         }
         if(direction == 'W'){
         
            if(current.westPtr.stopId.equals(busStop2)){
               timeTraveled += current.secsToNextStopWest;
               break;
            }
            timeTraveled += current.secsToNextStopWest;
            current = current.westPtr;
         }
      
      
      }
      return timeTraveled;
   
   
   
     
        /*this value is set to 0 so the class compiles. 
                   You will need to return a calculated value*/
   }
    
    /*
    * @return String A String representation of the 
    * busRoute from West to East
    */
   public String toString(){
      StringBuilder res = new StringBuilder();
      BusStop current = busRoute;
      while(current != null){
         res.append(current.stopId);
         res.append(current.inService ? " (active)" : "(out of service)");
         res.append(" -> ");
         current = current.eastPtr;
      
      }
      res.append("null\n");
      return res.toString();/*this value is set to "" so the class compiles. 
                   You will need to return a calculated value*/
   }
    
    /**
    * A class to represent a single bus stop
    *
    ************************************
    * NOTE: private datafields of an inner class are able 
    * to be accessed directly by the outer class!!
    ************************************
    * @author Nick Meek
    */
   private class BusStop{
    
      private String stopId; // Unique id
      private int secsToNextStopEast;
      private int secsToNextStopWest;
      private BusStop eastPtr; 
      private BusStop westPtr;
      private boolean inService;
    
      /**
      * Default constructor
      */
      public BusStop(){
         this.inService = false;
      }
    
    /**
    * Constructor
    * @param stopId The unique identifies for this bus Stop
    * @param secsToNextStopEast How many seconds to the next (inService) bus Stop going East
    * @param secsToNextStopWest How many seconds to the next (inService) bus Stop going West
    * @param inService Is this bus Stop currently in use
    */
      public BusStop(String stopId, int secsToNextStopWest, int secsToNextStopEast, boolean inService){
         this.stopId = stopId;
         this.secsToNextStopEast = secsToNextStopEast;
         this.secsToNextStopWest = secsToNextStopWest;
         this.inService = inService;
      }
       
       /** A simplified string representation of this bus stop.*/
      public String toString(){
         return this.stopId;
      }
   }
}
