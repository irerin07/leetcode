class Solution {
    public static int maxProfit(int[] prices) {
        int currentMin = prices[0];
        int currentProfit = 0;
        
        for (int price : prices) {
            currentProfit = Math.max(currentProfit, price - currentMin);
            currentMin = Math.min(currentMin, price);
        }
        
        return currentProfit;
    }
}