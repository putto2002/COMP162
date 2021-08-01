import java.util.Arrays;
/**
* Application class for ArrayFun
* @author Put Suthsrisinlpa
*/
public class App{
   public static void main(String[] args){
      ArrayFun[] arrayFuns = new ArrayFun[3];
      arrayFuns[0] = new ArrayFun();
      arrayFuns[1] = new ArrayFun(2, 5, 1, 7);
      arrayFuns[2] = new ArrayFun(1, 4, 100, 300);
      
              System.out.println(arrayFuns[1].toString());
      System.out.println("Length: " + arrayFuns[1].getNumElements());
      System.out.println("Copy: " + Arrays.toString(arrayFuns[1].getArrayCopy()));
      System.out.println("Sum: " + arrayFuns[1].getArrayTotal());
      System.out.println("Average: " + arrayFuns[1].getArrayAverage());
      System.out.println("Smallest element: " + arrayFuns[1].getSmallestElement());
      System.out.println("Largest element: " + arrayFuns[1].getLargestElement());
      System.out.println("Smallest element index: " + arrayFuns[1].getSmallestElementIndex());
      System.out.println("Largest element index: " + arrayFuns[1].getLargestElementIndex());
      System.out.println("Reversed: " + Arrays.toString(arrayFuns[1].getArrayReversed()));

      
       

      System.out.println("Before sort: " + Arrays.toString(arrayFuns));
      Arrays.sort(arrayFuns);
      System.out.println("Before sort: " + Arrays.toString(arrayFuns));
   
   
   
      
      
   
   }
}