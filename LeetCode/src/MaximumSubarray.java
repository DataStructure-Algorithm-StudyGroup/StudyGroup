//https://leetcode.com/problems/maximum-subarray/
/*
Given an integer array nums, find the contiguous subarray
(containing at least one number) which has the largest sum and return its sum.
 */
public class MaximumSubarray {

    public static int maxSubArray_BruteForce(int[] nums) {
        int maximumSum = 0;
        int start = 0;
        int end = 0;
        for (int left = 0; left < nums.length; left++) {
            int runningWindowSum = 0;
            for (int right = left; right < nums.length; right++) {
                runningWindowSum += nums[right];
                if (runningWindowSum > maximumSum) {
                    maximumSum = runningWindowSum;
                    start = left;
                    end = right;
                }
            }
        }
        System.out.println("Start: " + start + " and End:" + end);
        return maximumSum;
    }

    public static int findMaximumSubarray_BruteForce(int[] arr) {
       int n = arr.length;
       int maximumSubArraySum = Integer.MIN_VALUE;
       int start = 0;
       int end = 0;

       for(int left = 0; left<n; left++) {
           int runningWindowSum = 0;
           for(int right=left; right<n; right++) {
              runningWindowSum += arr[right];
              if(runningWindowSum > maximumSubArraySum) {
                  maximumSubArraySum = runningWindowSum;
                  start = left;
                  end = right;
              }//-2, 2, 5, -11, 6
               System.out.println(left + ":" + right + ":"+ runningWindowSum + ":" + maximumSubArraySum);
           }
       }
       return maximumSubArraySum;
    }

    public static int maxSubArray(int[] nums) {
        if(nums == null) {
            return 0;
        }
        if(nums.length < 2)  {
            return nums[0];
        }
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for(int left=1; left <nums.length; left++) {
            maxCurrent = Math.max(nums[left], maxCurrent + nums[left]);
            if(maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //int g = findMaximumSubarray(arr);
        int g = maxSubArray(arr);
        System.out.println("New Value is:" + g);
    }
}
