/**
 * Created by huzaifa.aejaz on 5/23/18.
 */
public class Distinct {
    public int numDistinct(String s, String t) {
        int m = s.length();//row length
        int n = t.length();//column length
        int[][] dp = new int[m+1][n+1];

        for(int j = 0; j <= m; j++){
            dp[j][0]=1;
        }
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                if(s.charAt(i)==t.charAt(j)){
                    dp[i+1][j+1]=dp[i][j]+dp[i][j+1];
                }
                else{
                    dp[i+1][j+1] = dp[i][j+1];
                }
            }
        }
        return dp[m][n];

    }
}
