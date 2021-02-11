//https://leetcode.com/problems/two-sum/
/*
Given an array of integers nums and an integer target, return indices of the two numbers
such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 103
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = (nums, target) => {
    let comp = new Map();//Complements
    let foundPairResult = [];
    for(let index in nums) {
        if (comp.has(nums[index])) {
            foundPairResult[0] = parseInt(comp.get(nums[index]));
            foundPairResult[1] = parseInt(index);
            return foundPairResult;
        }
        comp.set(target - nums[index], index);
    }
   return foundPairResult;
};
//Best solution from LeetCode
var twoSumBestSolution = function(nums, target) {
    const result={};
    for (let i = 0; i < nums.length; i++){
        const num = nums[i];
        if(result[num]) return [result[num]-1,i]
        else result[target-num] = i+1;
    }
}
let nums1 = [7,7,2,11,15];
let target1 = 9;
console.log(twoSumBestSolution(nums1, target1));

let nums2 = [3,2,4];
let target2 = 6;


let nums3 = [3,4];
let target3 = 6;

//console.log(twoSum(nums1, target1));
//console.log(twoSumBestSolution(nums1, target1));