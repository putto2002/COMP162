
import java.util.Scanner;
public class Bicycle{
   private int wheelDia;
   private boolean electric;
   private String colour;
   
   public Bicycle(){}
   
   public Bicycle( int wheelDia, boolean electric){
      this.wheelDia = wheelDia;
      this.electric = electric;
      setColour();
   }
   
   public void setColour(){
      Scanner sc = new Scanner(System.in);
      System.out.println("What is this " + this.wheelDia + "mm bicycle?");
      String colour = sc.next();
      this.colour = colour;
   }
    
   public boolean isElectric() {
      return this.electric;
   }
   
   public double getImperial(){
      return (this.wheelDia / 25.4);
   }
   
   public int getMatric() {
      return this.wheelDia;
   }
   
   public String toString(){
   String electricString = "";
   String wheelDiaString = "";
      if(this.electric){
         electricString =  "Electric";
         wheelDiaString = getImperial() + " inches";
      } else {
         electricString = "Push-bike";
         wheelDiaString = getMatric() + "mm";
      }
      
      return "Bicycle is " + this.colour + ". Wheel size is " + wheelDiaString + ". " + electricString;
   }
}