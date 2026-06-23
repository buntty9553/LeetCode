Problem : 1672 -> Richest Customer Wealth -> Easy
Link : https://leetcode.com/problems/richest-customer-wealth



class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        
        for(int row = 0; row < accounts.length; row++){
                int customer = 0;
            for(int col = 0; col < accounts[row].length; col++){
                customer += accounts[row][col];
            }

            if(customer > max_wealth){
                max_wealth = customer;
            }

        }
        return max_wealth;
    }
    
}