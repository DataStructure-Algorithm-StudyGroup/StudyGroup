//https://leetcode.com/problems/two-sum/
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length == 0) return result;
        HashMap<Integer, Integer> ComplementIndices = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length;i++) {
            if(ComplementIndices.containsKey(nums[i])) {
                result[0] = ComplementIndices.get(nums[i]);
                result[1] = i;
                return result;
            }
            ComplementIndices.put(target - nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] +" " + result[1]);
    }
}
/*

Complexity Analysis:
Time Complexity: O(n)
Space Complexity: O(n)

 */