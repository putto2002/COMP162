import java.util.*;
public class SplitArrayList{
 public static void main(String[] args){
  ArrayList<Integer> integers = new ArrayList<Integer>();
  arrayPopulator(integers);
  for(int integer: integers){
   System.out.print(integer + " ");
  }
  System.out.println();
  getSplit(integers);
  for(int integer: integers){
   System.out.print(integer + " ");
  } 
 }

 public static void arrayPopulator(ArrayList<Integer> integers){
  Random r = new Random();
  int length = r.nextInt(30 - 20 + 1) + 20;
  for(int i = 0; i <= length; i ++){
   integers.add(r.nextInt(100) + 1 );

  }
}
 public static void getSplit(ArrayList<Integer> integers){
  int curIndex = integers.size() - 1;
  int oddStartIndex = integers.size() - 1;
  while(curIndex >= 0){
   int curInt = integers.get(curIndex);
   if(curInt % 2 != 0){
     integers.remove(curIndex);
     integers.add(oddStartIndex, curInt);
     oddStartIndex--;
     
   } 
  curIndex--;
  }
  
 }
}
