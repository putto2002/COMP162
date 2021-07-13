
public class CoinsApp{
   public static void main(String[] args){
      boolean[] coinTosses = {true, false, true, true, false};
      Coins c = new Coins(coinTosses);
      System.out.println(c.countHeads());
      System.out.println(c.toString());
      
      // find average number of runs when 1000 coins are tossed 100 times
      int numberOfCoins = 1000;
      int toss = 100;
      int runs = 0;
      int averageRuns;
      for(int i = 0; i <= toss; i++){
       Coins coins = new Coins(numberOfCoins);
       runs += coins.countRuns();
      } 
      averageRuns = runs/100;
      System.out.println(averageRuns);
      
      // find average length of longest runs when 1000 coins are tossed 100 times
      
      
      
      }
}