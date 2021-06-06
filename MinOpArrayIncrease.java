// Problem Link : https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/

class Solution {
    public int minOperations(int[] nums) {
        int count = 0,temp;
        for(int i = 1; i < nums.length; i++) {
            temp = 0;
            if(nums[i-1] >= nums[i]) {
                temp = nums[i-1] - nums[i] + 1;
                nums[i] = nums[i] + temp;
                count = count + temp;
            } 
        }
        return count;
    }
}
