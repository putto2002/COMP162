
public class MyClass{
   public static void main(String[] args){
      String[][] words = {{"Apple", "Aardvark", "Albatross"}, 
         {"Bear", "Baby", "Box"}, 
         {"Candy", "Cave", "Cube"},
         {"Dog", "Desk"}};
   
      for(int row = 0; row < words.length; row ++){
         for(int col = 0; col < words[row].length; col ++){
            System.out.print(words[row][col] + " ");
         }
         System.out.println();
      }
   
      findChar('v', words);
      findChar('b', words);
   
   }
 
   public static void findChar(char ch, String[][] words){
      String wordsContainingCh = "";
      for(int row = 0; row < words.length; row ++){
         for(int col = 0; col < words[row].length; col ++){
            if(words[row][col].toLowerCase().indexOf(ch) >= 0){
               wordsContainingCh += words[row][col] + " ";
            }   
         }
      }
      System.out.println(wordsContainingCh);
   
   
   }
}