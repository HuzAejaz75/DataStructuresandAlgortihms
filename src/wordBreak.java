import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by huzaifa.aejaz on 7/5/18.
 */
public class wordBreak {
    /*public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        for(int i = s.length(); i >=0; i--){
            String check = s.substring(0,i);
            if(wordDict.contains(check)){
                s=s.substring(i,len);
                i=s.length()+1;
                len = s.length();
            }
        }
        if(s.equals(""))return true;
        else return false;
    }*/
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet=new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
