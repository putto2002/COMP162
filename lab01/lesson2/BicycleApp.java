
public class BicycleApp{
 public static void main(String[] args){
  Bicycle[] bicycles = {new Bicycle( 697, true), 
  new Bicycle( 660,  false), 
  new Bicycle( 660,  false) };
  
  for(Bicycle bicycle: bicycles){
   System.out.println(bicycle.toString());
  }
  
  getLargestWheelBike(bicycles);
    
 }
 
 public static void getLargestWheelBike (Bicycle[] bicycles){
 Bicycle largestWheelBicycle = bicycles[0];
  for(Bicycle bicycle: bicycles){
   if(bicycle.getMatric() > largestWheelBicycle.getMatric()){
    largestWheelBicycle = bicycle;
   }
   
  }
  
  System.out.println("Largest bicycle:  " + largestWheelBicycle.toString());
 }
}