import java.util.List;

/**
 * Created by huzaifa.aejaz on 7/5/18.
 */
public class wordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
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
    }
}
