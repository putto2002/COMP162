import java.util.*;
import java.io.*;
public class ArrayFlattenerApp{
   public static void main(String[] args){
      String fileName = "numbers1.txt";
      int[][] arrs = new int[3][];
      try{
         Scanner sc = new Scanner(new File(fileName));
     
         
         int i = 0;
         
         while(sc.hasNextLine()){
           String line = sc.nextLine();
           String[] lineArrs = line.split(" ");
           arrs[i] = new int[lineArrs.length];
           for(int j = 0; j < arrs[i].length; j++){
              arrs[i][j] = Integer.parseInt(lineArrs[j]);
           }
           i++;
                                 
         }
         
      } catch(Exception e){
         System.out.println("File not found");
      }  

      for(int[] arr: arrs){
         System.out.println(Arrays.toString(arr));
      }
      
      System.out.println(Arrays.toString(getFlattened(arrs)));

      
   }

   public static int[] getFlattened(int[][] nums){
      
      int arrLength = 0;
      int index = 0;

      for(int i = 0; i < nums.length; i++){
         arrLength += nums[i].length;
      }

      int[] arr = new int[arrLength];
      

      for(int i = 0; i < nums.length; i++){
         for(int j = 0; j < nums[i].length; j++){
            arr[index] = nums[i][j];
            index++;

         }
      }

      return arr;
   }
 
}