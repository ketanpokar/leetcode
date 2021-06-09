// Problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int prev = nums[0], size = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != prev) {
                prev = nums[i];
                nums[size] = nums[i];
                size++;
            }
        }
        return size;
        
    }
}
