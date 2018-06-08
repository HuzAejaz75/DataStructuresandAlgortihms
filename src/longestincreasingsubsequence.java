import java.util.Arrays;

/**
 * Created by huzaifa.aejaz on 5/30/18.
 */
public class longestincreasingsubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for(int x : nums) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len)
                len++;
        }

        return len;
    }
}
