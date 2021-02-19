//https://leetcode.com/problems/merge-sorted-array/
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.

Example:
Input: nums1:[1, 2, 3, 4, 0, 0 ,0] nums2:[2, 5, 6]
Output: [1, 2, 2, 3, 4, 5, 6]
 */


public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // In this code we start comparison from the last index
        //first compare the last non-zero element of A with last element of B

       while(m>0 && n>0) {
            if(nums1[m-1] > nums2[n-1]) {
                nums1[m+n-1] = nums1[m-1];
                m--;
            } else{
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
       }

       //Special case if A initialized element is "0" and B have elements. then we copy element from B to A
        while(n>0){
            nums1[m+n-1] = nums2[n-1];
            n--;
        }
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{0,0,0,0,0};
        int[] num2 = new int[]{2,5,6, 7,8};
        merge(num1,0, num2, 5);
    }
}
