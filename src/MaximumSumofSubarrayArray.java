/**
 * Created by huzaifa.aejaz on 8/7/18.
 */
public class MaximumSumofSubarrayArray {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int[][] dp = new int[4][nums.length + 1];
        int sum = 0;
        int[] accu = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            accu[i] = sum;
        }
        int[][] id = new int[4][nums.length + 1];
        int max = 0, inId = 0;
        for(int i = 1; i < 4; i++) {
            for(int j = k-1 ; j < nums.length; j++) {
                int tmpmax = j - k < 0 ? accu[j] : accu[j] - accu[j-k] + dp[i-1][j-k];
                if(j - k >= 0) {
                    dp[i][j] = dp[i][j-1];
                    id[i][j] = id[i][j-1];
                }
                if(j > 0 && tmpmax > dp[i][j-1]) {
                    dp[i][j] = tmpmax;
                    id[i][j] = j-k+1;
                }
            }
        }
        int[] res = new int[3];
        res[2] = id[3][nums.length-1];
        res[1] = id[2][res[2] - 1];
        res[0] = id[1][res[1] - 1];
        return res;
    }
}
