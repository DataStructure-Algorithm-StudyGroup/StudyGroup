//https://leetcode.com/problems/contains-duplicate/description/
/*
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

import java.util.*;

public class ContainsDuplicate {
    //BruteFore
    //Time complexity: O(n^2)
    //Space complexity: O(1)
    public static boolean containsDuplicateBruteSolution(int[] nums) {
        for(int i=0;i< nums.length;i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        //
        /* 83%
       Set<Integer> nonDuplicateSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!nonDuplicateSet.add(nums[i])) {
                return true;
            }
        }
        return false;
        */
        //Following solution 99% faster
        Arrays.sort(nums); //Sorting array

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
     int[] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
     boolean result = containsDuplicate(nums);
     System.out.println(result);
    }
}
