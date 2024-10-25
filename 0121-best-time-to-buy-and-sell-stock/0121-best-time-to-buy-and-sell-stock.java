class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // Initialize minPrice to a large value
        int maxProfit = 0;                 // Initialize maxProfit to 0
        
        // Traverse through the prices
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // Update minPrice if a lower price is found
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  // Calculate profit and update maxProfit if it's higher
            }
        }
        
        return maxProfit;  // Return the maximum profit
    }
}
