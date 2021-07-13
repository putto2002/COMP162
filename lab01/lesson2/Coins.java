
import java.util.Random;
/**
* A class to represent a series of coin tosses and 
* provide methods to supply information about them.
* @author Nick Meek
*/

public class Coins{

   public static final boolean HEADS = true;
   public static final boolean TAILS = false;

   private boolean[] coins;

   public Coins(boolean[] coins) {
      this.coins = coins;
   }
    
   public Coins(String c){
      boolean[] coins = new boolean[c.length()];
      for(int ch = 0; ch < c.length(); ch++){
         if(c.charAt(ch) == 'H'){
            coins[ch] = true;
         } else {
            coins[ch] = false;
         }
            
      }
        
      this.coins = coins;
   }
    
   public Coins(int length){
      boolean[] coins = new boolean[length];
      Random r = new Random();
      for(int i = 0; i < length; i++){
         boolean coinFace = r.nextBoolean();
         if(coinFace){
            coins[i] = true;      
         }else {
            coins[i] = false;            }
            
      }
        
      this.coins = coins;
   }
    
   public int countRuns(){
      int runs = 0;
      int runCounter = 0;
      boolean prevCoin = this.coins[0];
      for(int i = 1; i < coins.length; i++){
         if(coins[i] == (prevCoin)){
            runCounter ++;
            if(runCounter == 1){
               runs++;
            }
         } else {
            runCounter = 0;
             
            
         }
            
         prevCoin = coins[i];
      }
        
      return runs;
   }
    
    
   public int countHeads(){
      int counter = 0;
      for(int i = 0; i < coins.length; i++){
         if(coins[i]){
            counter ++;
         }
      
      }
     
      return counter;
   }
    
   public String toString(){
      String coinsToString = "";
      for(int i = 0; i < coins.length; i++){
         if(coins[i]){
            coinsToString += "H";
         
         } else {
            coinsToString += "T";
         }
      }
     
      return coinsToString;
   }

}