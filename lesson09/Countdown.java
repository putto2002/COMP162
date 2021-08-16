public class Countdown{
 public static void main(String[] args){
  countdown(7);
 }
 public static void countdown(int i){
  if(i <= 0) return;
  System.out.println(( i % 2 == 0) ? i + " is an Even Number" : i + " is an Odd Number");
  countdown(i - 1);
 }
}
