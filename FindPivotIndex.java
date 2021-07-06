// Problem Link : https://leetcode.com/problems/find-pivot-index/

class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        
        if(nums.length == 1) return 0;
        
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        
        if(sum - nums[0] == 0) {
            return 0;
        }
        int left = nums[0];
        int right = sum - nums[0];
        for(int i = 1; i < nums.length - 1; i++) {
            right = right - nums[i];
            if(right == left) {
                return i;
            }
            left = left + nums[i];
        }

        if(left == 0) return nums.length - 1;
        return -1;
    }
}
