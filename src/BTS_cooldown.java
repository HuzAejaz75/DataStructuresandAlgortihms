/**
 * Created by huzaifa.aejaz on 8/21/18.
 */
public class BTS_cooldown {
    public int maxProfit(int[] prices) {
        int sell_today=0, cooldown=0;//two profits
        for(int i=1; i<prices.length; i++){//from 1 to the length of the prices array
            int yest_prof=sell_today;//copy the old value
            sell_today=Math.max(sell_today+prices[i]-prices[i-1], cooldown);
            cooldown=Math.max(yest_prof, cooldown);
        }
        return Math.max(sell_today, cooldown);
    }
}
