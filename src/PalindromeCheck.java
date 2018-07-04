/**
 * Created by huzaifa.aejaz on 7/3/18.
 */
public class PalindromeCheck {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String checkThis = s.substring(i,j);
                if(palidromeCheck(checkThis)){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean palidromeCheck(String str){
        int l = 0;
        int r = str.length()-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
