// Problem link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < min) 
                min = prices[i];
            
            max = Math.max(prices[i] - min, max);
        }
        return max;
    }
}
