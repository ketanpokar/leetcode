// Problem Link : https://leetcode.com/problems/calculate-money-in-leetcode-bank/

class MoneyInLeetCodeBank {
    public int totalMoney(int n) {
        int i = 1, sum = 0, temp = n;
        for(; i <= temp/7; i++) {
            sum = sum + 28 + ((i - 1) * 7);
            n = n - 7;
            
        }
        sum = sum + (n * (n + 1) / 2) + ((i - 1) * n);
        return sum;
    }
}
