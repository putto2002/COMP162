public class BunnyEars2{
 public static void main(String[] args){
 
  System.out.println(bunnyEars2(2));
 }
 

 
 public static int bunnyEars2(int bunnies){
  if(bunnies < 1) return 0;
  return (bunnies % 2 == 0 ? 3 : 2) + bunnyEars2(bunnies - 1); 
  }
}