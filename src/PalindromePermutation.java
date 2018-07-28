import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 7/27/18.
 */
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s)
    {
        if(s.length()<2) return true;
        List<String> results = new ArrayList<>();
        boolean[] used = new boolean[s.length()];
        String temp = "";
        palindromeHelper(temp, results,used,s);
        for(String t : results){
            System.out.println(t);
        }
        if(results.size()>1) return true;
        else return false;
    }

    private void palindromeHelper(String temp, List<String> result, boolean[] used ,String s)
    {
        if(temp.length()==s.length()){
            if(checkPalindrome(temp) && !result.contains(temp))
            {
                result.add(temp);
            }
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                if (!used[i]) {
                    used[i] = true;
                    String hold = temp;
                    temp += s.charAt(i);
                    palindromeHelper(temp, result, used, s);
                    used[i] = false;
                    temp = hold;
                }
            }
        }

    }
    private boolean checkPalindrome(String s)
    {
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
