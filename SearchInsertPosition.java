// Problem Link : https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length, mid = 0;
        
        while(low < high) {
            mid = (low + high) / 2;
            if(nums[mid] == target) {
                break;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        if(nums[mid] == target) {
            return mid;
        } 
        if(low < nums.length && nums[low] >= target) {
            mid = low;
        } else if(low < nums.length && nums[low] < target) {
            mid = low + 1;
        } else if(low == nums.length) {
            mid = low;
        }
        return mid;
    }
}
