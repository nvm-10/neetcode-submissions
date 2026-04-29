class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int maxP = 0;

        while(j < prices.length) {
            int num = prices[j] - prices[i];
            if(num >= 0) {
                maxP = Math.max(maxP, num);
                j++;
            } else if(num < 0 && i <= j) {
                i++;
            }
            else {
                i++;
                j++;
            }
        }
        return maxP;
    }
}
