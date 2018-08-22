/**
 * Created by huzaifa.aejaz on 8/21/18.
 */
public class BTS_cooldown {
    public int maxProfit(int[] prices) {
        int profit1=0, profit2=0;//two profits
        for(int i=1; i<prices.length; i++){//from 1 to the length of the prices array
            int copy=profit1;//copy the old value
            profit1=Math.max(profit1+prices[i]-prices[i-1], profit2);
            profit2=Math.max(copy, profit2);
        }
        return Math.max(profit1, profit2);
    }
}
