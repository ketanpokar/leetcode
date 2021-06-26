// Problem Link : https://leetcode.com/problems/single-number/

class SingleNumber {
    public int singleNumber(int[] nums) {
        int n = 0;
        for(int i : nums) {
            n = n ^ i;
        }
        return n;
    }
}
