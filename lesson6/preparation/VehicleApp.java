package preparation;
/**
 * Application class
 * @author Put Suthisrisinlpa
 * @see Vehicle
 * @see Car
 * @see Boat
 */
public class VehicleApp{
   public static void main (String[] args){
   
      Vehicle[] vehicles = {new Car("Toyota Starlet", "Japan", 25, 0),
         new Car("Volvo XC40", "Sweden", 20, 2),
         new Boat("Markline 700 Sport", "New Zealand", 40, 2)};
         
         
         for (Vehicle vehicle: vehicles){
           System.out.println(vehicle.toString());
         }
      
   }
}