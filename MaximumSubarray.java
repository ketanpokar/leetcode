// Problem Link : https://leetcode.com/problems/maximum-subarray/

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if(sum < 0 && i != nums.length - 1) {
                sum = 0;
            } else if(sum > max) {
                max = sum;
            } 
        }
        return max;
    }
}
