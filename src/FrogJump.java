import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by huzaifa.aejaz on 8/7/18.
 */
public class FrogJump {
    public boolean canCross(int[] stones) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
            map.put(stones[i], new HashSet<Integer>());
        }
        map.get(0).add(0);
        for (int i = 0; i < stones.length; i++) {
            for (int k : map.get(stones[i])) {
                for (int step = k - 1; step <= k + 1; step++) {
                    if (step > 0 && map.containsKey(stones[i] + step)) {
                        map.get(stones[i] + step).add(step);
                    }
                }
            }
        }
        return map.get(stones[stones.length - 1]).size() > 0;
    }
   /* public boolean canCross(int[] stones) {
        int[] dp = new int[stones.length];
        dp[0] = 0;
        boolean[] possible = new boolean[stones.length];
        possible[0]=true;
        int jump = 1;
        for(int i = 1; i < stones.length; i++){
            for(int j = 0; j < i; j++){
                if(stones[j]+ dp[j] + 1 == stones[i] && possible[j]){
                    //jump = jump + 1;
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                    possible[i] = true;
                }
                else
                if(stones[j] + dp[j] == stones[i]  && possible[j]){
                    dp[i]= Math.max(dp[j],dp[i]);
                    possible[i] = true;
                }
                else
                if(stones[j]+dp[j]-1==stones[i] && possible[j]){
                    // jump = jump - 1;
                    dp[i] = Math.max(dp[j]-1,dp[i]);
                    possible[i] = true;
                }
            }
        }
        return possible[possible.length-1];
    }*/
}
