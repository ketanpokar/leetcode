// Problem Link : https://leetcode.com/problems/climbing-stairs/

class ClimbingStairs {
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n];
        return calculate(n);
        
    }
    public int calculate(int n) {
        if(n > 0 && memo[n - 1] != 0) return memo[n - 1];
        if(n == 0) return 1;
        if(n < 0) return 0;

        memo[n - 1] = calculate(n-1) + calculate(n-2);
        return memo[n - 1];
    }
}
