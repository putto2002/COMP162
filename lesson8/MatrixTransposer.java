
import java.util.*;
public class MatrixTransposer {
 public static void main(String[] args){
 
  int[][] matrix = arrayGenerator();
  for(int[] row: matrix){
   System.out.println(Arrays.toString(row));
  }
  int[][] transposedMatrix =  transposeMatrix(matrix);
  System.out.println();
  for(int[] row: transposedMatrix){
   System.out.println(Arrays.toString(row));
  }
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
 public static int[][] transposeMatrix(int[][] matrix){
  int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
  
  for(int c = 0; c < matrix[0].length; c++){
   for(int r = 0; r < matrix.length; r++){
    transposedMatrix[c][r] = matrix[r][c];
   }
  }
 return transposedMatrix;
 }
}
