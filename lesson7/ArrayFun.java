import java.util.Random;
import java.util.Arrays;
/**
* ArrayFun represents an array, its properties and behaviours*/
public class ArrayFun implements ArrayMethodsInterface<ArrayFun>, Comparable<ArrayFun>{

   private int[] integers;

/** Default constructor for ArrayFun*/
   public ArrayFun(){
      int length = randomRange(3, 6);
      integers = new int[length];
      for (int i = 0; i < integers.length; i ++){
         integers[i] = randomRange(0, length);
      }
   
   };
 
 /** Constructor for Arrayfun*/
 
   public ArrayFun(int lowLength, int highLength, int lowNum, int highNum){
      int length = randomRange(lowLength, highLength);
      integers = new int[length];
      for(int i = 0; i <  integers.length; i ++){
         integers[i] = randomRange(lowNum, highNum);
      }
   
   }
 
 /**
    @param lo lower limit of the random range
    @param hi higher limit of the random range
    @return a random integer between lo and hi
    */
   public static int randomRange(int lo, int hi){
      Random r = new Random();
      return r.nextInt(hi - lo + 1) + lo;
   
   }
   
   /**
   * @return String representation of ArrayFun
   */
   
   public String toString(){
      return Arrays.toString(integers);   }
   
   /**
   * @return the length of ArrayFun
   */
   
   public int getNumElements(){
      return integers.length;
   }
   
   /**
   *@return a copy of integers   */
   
   public int[] getArrayCopy(){ 
      int[] copy = new int[integers.length];
      for (int i = 0; i < integers.length; i ++){
         copy[i] = integers[i];
      }
      return copy;
   }
   
   
   /**
   * @return the sum of all the elements in ArrayFun
   */
   
   public int getArrayTotal(){
      int sum = 0;
      for(int i = 0; i < integers.length; i++){
         sum += integers[i];
      }
    
      return sum;
   }
   
   /**
   * @return the avarege of the value of all the elements in ArrayFun
   */
   
   public double getArrayAverage(){
      int sum = 0;
      double length = integers.length + 1.00;
      for(int i = 0; i < integers.length; i++){
         sum += integers[i];
      }
    
      return sum/ length;
   }
   
   /**
   * @return a copy of integers array in a reversed order
   */
   public int[] getArrayReversed(){
     int[] reversedArr = new int[integers.length];
     for (int i = 0; i < integers.length; i ++){
      reversedArr[integers.length - i - 1] = integers[i];
     }
     return reversedArr;
   }
   
   /**
   * @return the smallest integer in ArrayFun
   */
   
   public int getSmallestElement(){
    int smallest = integers[0];
    for(int i = 0; i < integers.length; i++){
     if(integers[i] < smallest){
      smallest = integers[i];
     }
    }
    return smallest;
   }
   
   /**
   * @return the largest integer in ArrayFun
   */
    public int getLargestElement(){
    int largest = integers[0];
    for(int i =  0; i < integers.length; i++){
     if(integers[i] > largest){
      largest = integers[i];
     }
    }
    return largest;
   }
   
   /**
   * @return the index of the smallest integer in ArrayFun
   */
   
   public int getSmallestElementIndex(){
    int smallest = integers[0];
    int index = 0;
    for(int i = 0; i < integers.length; i++){
     if(integers[i] < smallest){
        smallest  = integers[i];
        index = i;
     }
    }
    return index;
   }
   
   
   /**
   * @return the index of the largest integer in ArrayFun
   */
    public int getLargestElementIndex(){
    int largest = integers[0];
    int index = 0;
    for(int i = 0; i < integers.length; i++){
     if(integers[i] > largest){
      largest = integers[i];
      index = i;
     }
    }
    return index;
   }
   
   @Override
   public int compareTo(ArrayFun arrFun){
      return  this.getNumElements() - arrFun.getNumElements();
   }



   
   


 
}