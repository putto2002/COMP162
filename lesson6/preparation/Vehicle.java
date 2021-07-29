package preparation;
/**
 * An actract representation of a Vehicle
 * @author Put Suthisrisinlpa
 */
public abstract class Vehicle {
    protected String name;
    protected String ctryOfOrigin;

    /** An acstract method which returns fuel comsumption of the vehicle
     * @param tripLength in km
     * @return fuel compsumtion which can be calculated by trip length multiply by fuel comsumption rate
      */
    
    public abstract int fuelConsumption(int tripLength);

    /**
     * Contructor for Vehicle
     * @param name brand and model of the vehicle
     * @param ctryOfOrigin country in which the vehicle was produced
     */
    
    public Vehicle(String name, String ctryOfOrigin){
        this.ctryOfOrigin = ctryOfOrigin;
        this.name = name;
    }

    
    

}