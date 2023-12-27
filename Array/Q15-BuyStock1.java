class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int min =Integer.MAX_VALUE,profit=0;
        for (int stockPrice:prices){
            min = Math.min(min,stockPrice);
            profit=Math.max(profit,stockPrice-min);
 }
        return profit;
    }
}