/**
We have a number of bunnies and each bunny has two big floppy ears.
We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
*/

public class BunnyEars{
 public static void main(String[] args){
  System.out.println(bunnyEars(6));
  System.out.println(bunnyEars2(2));
 }
 
 public static int bunnyEars(int bunnies){
  if(bunnies < 1) return 0;
  return 2 + bunnyEars(bunnies - 1);
 }
 
 public static int bunnyEars2(int bunnies){
  if(bunnies < 1) return 0;
  return (bunnies % 2 == 0 ? 3 : 2) + bunnyEars2(bunnies - 1); 
  }
}