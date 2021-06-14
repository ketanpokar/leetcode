// Problem Link : https://leetcode.com/problems/remove-element/

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        
        int pos = 0;
        for(int num : nums) {
            if(num != val) {
                nums[pos++] = num;
            }
        }
        return pos;
    }
}
