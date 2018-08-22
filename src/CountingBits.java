/**
 * Created by huzaifa.aejaz on 7/22/18.
 */
public class CountingBits {
    public int[] countingBits(int num){
        int[] ret = new int[num+1];
        ret[0] = 0;
        int pow = 1;
        for(int i = 1, t = 0; i <= num; i++, t++) {
            if(i == pow) {
                pow *= 2;
                t = 0;
            }
            ret[i] = ret[t] + 1;
        }
        return ret;
    }
    public int[] countingBits2(int num){
        int[] dp = new int[num+1];
        dp[0]=0;
        if(num >0){
            dp[1]=1;
            int next_power = 2;
            int j = 0;
            for(int i = 2 ; i <= num; i++){

                if(i == next_power)
                {
                    dp[i] = dp[0]+1;
                    next_power *=2;
                    j=1;
                }
                else{
                    dp[i] = dp[j] + 1;
                    j++;
                }
            }
        }
        return dp;
    }
}
