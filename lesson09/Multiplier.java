public class Multiplier{
 public static void main(String[] args){
  System.out.println(multiply(5, 4));
  System.out.println(multiply(30, 5));
 }
 
 public static int multiply(int base, int limit){
  if(limit == 1) return base;
  return base + multiply(base, limit - 1);
 }
}