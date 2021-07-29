package preparation;
/**
 * A representation of a Car subclasses Vehicle
 * @author Put Suthisrisinlpa
 * @see Vehicle
 */
public class Car extends Vehicle {
    private int numAirBags;
    private int litrePerKm;

     /**
     * Contructor for Car
     * @param name brand and model of the car
     * @param ctryOfOrigin country in which the car was produced
     * @param OnepK number of litre of fuel the car consume in one km
     * @param airBags number of air bags the car has
     */
    
    public Car(String name, String ctryOfOrigin, int onepK, int airBags){
         super(ctryOfOrigin, name);
         numAirBags = airBags;
         litrePerKm = onepK;
       
    }

    /** fuelConsumption method inherited from Vehicle (abstract) class
     * @param tripLength length of the trip in km 
     * @return fuel consumed in a geven trip. This is calculated by multiplying tripLength by litrePerKm
     */
    public int fuelConsumption(int tripLength) {
        return this.litrePerKm * tripLength;
    }
    
    /**
     * @return string represnetaion of the information about the car
     */
    public String toString(){
     return "Car with " + numAirBags + " air bags made in " + ctryOfOrigin;
    }
}