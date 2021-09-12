/**

Given an array of ints, compute recursively the number of times that the value 11 
appears in the array. We'll use the convention of considering only the part of the 
array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
*/

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