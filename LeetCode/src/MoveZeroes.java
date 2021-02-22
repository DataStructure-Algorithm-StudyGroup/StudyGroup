//https://leetcode.com/problems/move-zeroes/description/
/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
import java.util.Arrays;

public class MoveZeroes {

    //BruteForce Solution
    //Time Complexity
    //Space Complexity

    public static void moveZeroes(int[] nums) {
       int length = nums.length;
       if(nums == null || length == 0) return;
       int currentNonZeroIndices = 0;
       for(int i=0; i<length; i++){
           if(nums[i] != 0){
               nums[currentNonZeroIndices++] = nums[i];
           }
       }
        while(currentNonZeroIndices<length){
            nums[currentNonZeroIndices++] = 0;
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
