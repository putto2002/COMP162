package preparation;
/**
 * A representation of a Boat subclasses Vehicle
 * @author Put Suthisrisinlpa
 * @see Vehicle
 */
public class Boat extends Vehicle {
 private int litresPerHr;
 private int numBerths;

 /**
     * Contructor for Boat
     * @param name brand and model of the boat
     * @param ctryOfOrigin country in which the boat was produced
     * @param onepH number of litre of fuel the boat consume in one hour
     * @param brths number of berths
     */
 public Boat(String name, String ctryOfOrigin, int onepH, int brths){
   super(name, ctryOfOrigin);
   litresPerHr = onepH;
   numBerths = brths;
 }
 /** fuelConsumption method inherited from Vehicle (abstract) class
     * @param tripLength length of the trip in km 
     * @return fuel consumed in a geven trip. This is calculated by multiplying tripLength by litrePerHr
     */
 public int fuelConsumption(int  tripLength){
   return tripLength * litresPerHr;
 }
 /**
     * @return string represnetaion of the information about the boat
     */
 public String toString(){
  return "Boat with " + numBerths + " berths made in " + ctryOfOrigin;
 }
}