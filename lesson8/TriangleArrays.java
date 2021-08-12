import java.util.*;
public class TriangleArrays {
    public static void main(String[] args){
        int[][] arr = arrayGenerator();
        printArray(arr);
        int[][] triangleArr = getTriangleArray(arr);
        printArray(triangleArr);


    }
    public static void printArray(int[][] arr){
        for(int[] row: arr){
          System.out.println(Arrays.toString(row));
         }
         System.out.println();
       }

    public static int[][] arrayGenerator(){
        Random random = new Random();
        int arrLength = random.nextInt(7 - 3 + 1) + 3;
        int innerArrLength = random.nextInt(7 - 3 + 1) + 3;
        int[][] arrs = new int[arrLength][];
        for(int r = 0; r < arrs.length; r++){
       
         arrs[r] = new int[innerArrLength];
         for(int c = 0; c < arrs[r].length; c++){
          int i = random.nextInt(50) + 1;
          arrs[r][c] = i;
         }
        }
       return arrs; 
      }

      public static int[][] getTriangleArray(int[][] nums){
          int numRow = (int) Math.floor(Math.sqrt(2*nums.length * nums[0].length));
          int[][] triangleArray = new int[numRow][];
          int curIndex = 0;
          int curRowLength = 1;
          int[] flattedNums = ArrayFlattenerApp.getFlattened(nums);
          for(int j = 0; j < triangleArray.length; j++){
              triangleArray[j]= new int[curRowLength];
              for(int i = 0; i < triangleArray[j].length; i++){
                  if(curIndex < flattedNums.length){
                      triangleArray[j][i] = flattedNums[curIndex];
                       curIndex++;

                  }
                  
              }
              curRowLength++;
          }
          

          return triangleArray;

      }
    
}
