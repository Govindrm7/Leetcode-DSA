class Solution {
    public int maxProfit(int[] prices) {
        // left = buy, right = sell
        int l = 0;
        int r = 1;
        int maxP = 0;

        while (r < prices.length){
            // profitable?
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                // Because we found a really low price if 
                // prices[l] > prices[r], so we shift l to new 
                // lowest price = r
                l = r;
            }
            // Right pointer will be updated regardless of 
            // the conditions
            r += 1;
        }
        return maxP;
    }
}