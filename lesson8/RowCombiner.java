import java.util.*;
import java.io.*;
public class RowCombiner{
 public static void main(String[] args){
  int[][] array1 = read2DArray("./numbers2.txt", 5);
  for(int[] row: array1){
   System.out.println(Arrays.toString(row));
  }
 System.out.println();
 int[][] combinedArray = combineXRows(array1, 3);
 printArray(combinedArray);
 }

 public static int[][] read2DArray(String filePath, int lineNum){
  int[][] array = new int[lineNum][];
  try{
   Scanner fileScanner = new Scanner(new File(filePath));
   int r = 0;

   while(fileScanner.hasNextLine()){
    String line = fileScanner.nextLine();
    String[] lineArr = line.split(" ");
    array[r] = new int[lineArr.length];
    for(int c = 0; c < lineArr.length; c++){
     array[r][c] = Integer.parseInt(lineArr[c]);
    }
     r++;    
   }
  } catch(Exception e){
   System.out.println("File not found!");
  }
  return array;
 }

 public static void printArray(int[][] arr){
  for(int[] row: arr){
    System.out.println(Arrays.toString(row));
   }
 }



 public static int[][] combine2Rows(int[][] nums){
  int[][] combinedArray = new int[nums.length % 2 == 0 ? nums.length/2 : nums.length/2 + 1][];
  for(int r = 0; r < combinedArray.length; r++){
   if(r ==  combinedArray.length - 1 & r % 2 != 0){
    combinedArray[r] = nums[nums.length - 1];
  
   } else {
    combinedArray[r] = new int[nums[2*r].length + nums[2*r + 1].length];
    System.arraycopy(nums[2*r], 0, combinedArray[r], 0, nums[2*r].length);
    System.arraycopy(nums[2*r + 1], 0, combinedArray[r], nums[2*r].length, nums[2*r + 1].length);
   }
  }
  return combinedArray;
 }

 public static int[][] combineXRows(int[][] nums, int x){
  int[][] combinedArray = new int[nums.length % x == 0 ? nums.length/x : nums.length/x + 1][];
  for(int r = 0; r < combinedArray.length; r++){
    if(r == combinedArray.length - 1 & r % x != 0){
      combinedArray[r] = nums[nums.length - 1];
    } else {
      int rowLength = 0;
      for(int i = 0; i < x; i++){
          rowLength += nums[x*r + i].length;
      }
      combinedArray[r] = new int[rowLength];
      System.arraycopy(nums[x*r], 0, combinedArray[r], 0, nums[x*r].length);
      int desPos = nums[x*r].length;
      for(int i = 1; i < x; i++){
       System.arraycopy(nums[x*r + i], 0, combinedArray[r], desPos, nums[x*r + i].length);
       desPos += nums[r*x + i].length;
      }
    }

  }

  return combinedArray;

 }
}
