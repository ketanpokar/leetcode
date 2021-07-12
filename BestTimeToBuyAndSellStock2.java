// Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
//         int maxProfit = 0;
//         for(int i = 0; i < prices.length - 1; i++) {
//             int min = 100000, profit = 0, j = i + 1;
//             for(; j < prices.length; j++) {
//                 if((prices[i] < prices[j]) && (prices[j] - prices[i]) > profit) {
//                     profit = prices[j] - prices[i];
//                 } else {
//                     break;
//                 }
//             }
//             i = j - 1;
//             maxProfit = maxProfit + profit;
//         }
        
//         int k = 0, profit = 0, maxProfit = 0;
//         for(int i = 1; i < prices.length; i++) {
//             if((prices[i] - prices[k]) > profit) {
//                 profit = prices[i] - prices[k];
//             } else {
//                 maxProfit = maxProfit + profit;
//                 profit = 0;
//                 k = i;
//             }
//         }
//         if(profit > 0) 
//             maxProfit = maxProfit + profit;
        
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++) {
           if(prices[i -1] < prices[i])
                maxProfit = maxProfit + prices[i] - prices[i - 1];
        }
        
        return maxProfit;
    }
}
