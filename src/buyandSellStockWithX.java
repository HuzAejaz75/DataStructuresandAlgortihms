/**
 * Created by huzaifa.aejaz on 5/19/18.
 */
public class buyandSellStockWithX {
    public int maxProfit(int[] prices, int fee) {
        if(prices.length <= 1) return 0;
        int maxProfit = 0, maxPrice = prices[0], res = 0, start = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] - prices[start] - fee > maxProfit) {
                maxPrice = prices[i];
                maxProfit = prices[i] - prices[start] - fee;
            }
            else if (prices[i] < maxPrice - fee || prices[i] < prices[start]){
                start = i;
                res += maxProfit;
                maxProfit = 0;
                maxPrice = prices[i];
            }
        }
        if(maxProfit != 0) res += Math.max(maxProfit, prices[prices.length - 1] - prices[start] - fee);
        return res;
    }
}
