// Problem Link : https://leetcode.com/problems/reverse-integer/

class ReverseInteger {
    public int reverse(int x) {
        
        long temp = Math.abs(x);
        long sum = 0;
        while(temp > 0) {
            sum = sum*10 + (int)(temp % 10);
            temp = temp / 10;
        }
        if(sum > 2147483647 || sum < -2147483648) return 0;
        
        return x < 0 ? (int) (-sum) : (int)sum;

    }
}
