// Problem Link : https://leetcode.com/problems/richest-customer-wealth/

class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++) {
            int customerSum = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                customerSum = customerSum + accounts[i][j];
            }
            if(customerSum > max) {
                max = customerSum;
            }
        }
        return max;
    }
}
