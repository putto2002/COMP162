public class Array11{
 public static void main(String[] args){
  int[] nums = {1, 2, 11};
  System.out.println(array11(nums, 0));
 }
 
 public static int array11(int[] nums, int index){
  if(index < 0 || index > nums.length - 1) return 0;
  int count;
  if(nums[index] == 11){
   count = 1;
  } else {
   count = 0;
  }

 return count + array11( nums, index + 1);
 }
}