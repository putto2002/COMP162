import java.util.Arrays;
/**
* Application class for ArrayFun
* @author Put Suthsrisinlpa
*/
public class App{
 public static void main(String[] args){
  ArrayFun arrA = new ArrayFun();
  ArrayFun arrB = new ArrayFun(10, 30, 1, 7);
  ArrayFun arrC = new ArrayFun(10, 12, 100, 300);
  
  System.out.println(arrC.toString());
  System.out.println("Length: " + arrC.getNumElements());
  System.out.println("Copy: " + Arrays.toString(arrC.getArrayCopy()));


System.out.println("Sum: " + arrC.getArrayTotal());


System.out.println("Average: " + arrC.getArrayAverage());
System.out.println("Smallest element: " + arrC.getSmallestElement());
System.out.println("Largest element: " + arrC.getLargestElement());
System.out.println("Smallest element index: " + arrC.getSmallestElementIndex());
System.out.println("Largest element index: " + arrC.getLargestElementIndex());




  
  System.out.println("Reversed: " + Arrays.toString(arrC.getArrayReversed()));

 }
}