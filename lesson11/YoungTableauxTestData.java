import java.util.*;
/** Contains test data that you can copy and paste into 
  * your program when you are ready for final testing. 
  * You're welcome :) */

public class YoungTableauxTestData{
   public static void main(String[] args){
   
      // These are valid Young tableaux
      int[][][] validTableaux = {{{1, 2, 3, 4, 5}}, {{1, 3, 4, 5}, {2}}, {{1, 2, 4, 5}, {3}}, 
                              {{1, 2, 3, 5}, {4}}, {{1, 2, 3, 4}, {5}}, {{1, 3, 5}, {2, 4}}, 
                              {{1, 2, 5}, {3, 4}}, {{1, 3, 4}, {2, 5}}, {{1, 2, 4}, {3, 5}}, 
                              {{1, 2, 3}, {4, 5}}, {{1, 4, 5}, {2}, {3}}, {{1, 3, 5}, {2}, {4}}, 
                              {{1, 2, 5}, {3}, {4}}, {{1, 3, 4}, {2}, {5}}, {{1, 2, 4}, {3}, {5}}, 
                              {{1, 2, 3}, {4}, {5}}, {{1, 4}, {2, 5}, {3}}, {{1, 3}, {2, 5}, {4}}, 
                              {{1, 2}, {3, 5}, {4}}, {{1, 3}, {2, 4}, {5}}, {{1, 2}, {3, 4}, {5}}, 
                              {{1, 5}, {2}, {3}, {4}}, {{1, 4}, {2}, {3}, {5}}, {{1, 3}, {2}, {4}, {5}}, 
                              {{1, 2}, {3}, {4}, {5}}, {{1}, {2}, {3}, {4}, {5}}
                             };
   
      // These are invalid Young tableaux
      int[][][] invalidTableaux = {{{1, 2, 3, 5, 4}}, {{2, 3, 4, 5}, {1}}, {{1, 2, 4, 3}, {5}}, 
                           {{1, 4, 5}, {3}, {2}}, {{1, 3, 5}, {6}, {4}}, {{2, 3, 5}, {1}, {4}}, 
                           {{1, 5}, {2}, {4}, {4}}, {{1, 2}, {3}, {5}, {4}}, {{1, 3}, {4}, {5}, {2}}, 
                           {{1, 2}, {4}, {3}, {5}}, {{1}, {2}, {5}, {4}, {3}}, {{1, 4}, {1}, {2}, {3}}, 
                           {{1, 5}, {3}, {4}, {7}}, {{1, 3}, {2}, {3}, {4}}, {{1, 2}, {3}, {4, 5}, {6}}, 
                           {{1}, {2}, {2}, {4}, {5}}
                          };

                        
                          
      System.out.println("Valid - should all be true!\n\n"); 
      for(int[][] valid:validTableaux){
         System.out.println(TableauApp.isTableau(valid));
      } 
    
      System.out.println("\n\n" + "*".repeat(40) + "\n\nInvalid - should all be false!\n\n"); 
      for(int[][] invalid:invalidTableaux){
        
         System.out.println(TableauApp.isTableau(invalid));
      } 

      
   
   }
   
}