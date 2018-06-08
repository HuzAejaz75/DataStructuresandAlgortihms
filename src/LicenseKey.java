import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 5/27/18.
 */
public class LicenseKey {
    public String licenseKeyFormatting(String S, int K)
    {
        String res = "";
        List<Character> wordStr = new ArrayList<>();
        int idx = 0;
        for(int i = S.length()-1; i >=0; i--)
        {
            if(idx < K && S.charAt(i) != '-'){
                wordStr.add(0,S.charAt(i));
                idx++;
            }
            else
            if(idx==K )
            {
                wordStr.add(0,'-');
                if(S.charAt(i)!='-'){
                    wordStr.add(0,S.charAt(i));
                    idx=1;
                }
                else
                     idx=0;
            }


        }
        int c =0;
        for(char s : wordStr)
        {
            if(s!='-'|| c!=0)
                res+=s;
            c++;
        }
        return res.toUpperCase();
    }
}
