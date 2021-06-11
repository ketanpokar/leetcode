// Problem Link : https://leetcode.com/problems/sign-of-the-product-of-an-array/

class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        long neg = 0;
        for(int n : nums) {
            if(n == 0) return 0;
            else if(n < 0) neg++;
        }
        if(neg % 2 == 0) return 1;
        else return -1;
    }
}
