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
public class RotateArray {
    /*
    //brute force:
    //Time: O(n*k). All the numbers are shifted by one step (O(n)) k times
    //Space: O(1). No extra space is used.
    public static void rotateBruteForce(int[] nums, int k) {
        k = k % nums.length;
        int temp, previous;
        for(int i =0;i<k;i++){
            //System.out.println("Outerloop  - " + nums[nums.length -1]);
            previous = nums[nums.length-1];
            for(int j =0;j<nums.length;j++) {
                temp= nums[j];
                nums[j] = previous;
                previous = temp;
                //System.out.println(temp);
                //System.out.println(nums[nums.length -1]);
              //System.out.println(Arrays.toString(nums));
            }
        }
    }
    /*
    [1, 2, 3, 4, 5, 6, 7]  k = 3
    [7, 1, 2, 3, 4, 5, 6]
    [6, 7, 1, 2, 3, 4, 5]
    [5, 6, 7, 1, 2, 3, 4]

    Current result [1, 2, 3, 4, 5, 6, 7] - Final Result [5, 6, 7, 1, 2, 3, 4]
    K = 3;
    n = 7 Length
    i = 0 becomes to i = (i+k) % n = 3 - (1)
    i = 1 becomes to i = (i+k) % n = 4 - (2)
    i = 2 becomes to i = (i+K) % n = 5 - (3)
    i = 3 becomes to i = (i+k) % n = 6 - (4)
    i = 4   becomes to i = 3 + 4 = 7 - (5)
    ...
    ..
    i = 5 becomes to i = (i+k) % n => (5+3)%7 = 1
     */
/*
    //When we use extra array:
    public static void rotateSolution1(int[] nums, int k) {
        k = k%nums.length;
        int n = nums.length;
        int[] outPut = new int[nums.length];
        for(int i=0; i<n;i++){
            outPut[(i+k)%n] = nums[i];
        }
        //System.out.println(Arrays.toString(outPut));
        for(int i=0; i< nums.length;i++){
            nums[i] = outPut[i];
        }
    }
*/
    //Using Reverse
    //Time complexity: O(n). n elements are reversed a total of three times.
    //Space complexity: O(1). No extra space is used.
    public static void rotate(int[] nums, int k) {
        int numsArrayLength = nums.length;
        k = k % numsArrayLength;
        reverse(nums, 0, numsArrayLength-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, numsArrayLength-1);
    }
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        //rotateBruteForce(nums, 3);
        //rotateSolution1(nums,3);
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
}
