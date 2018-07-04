import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huzaifa.aejaz on 7/2/18.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList();
        Map<String, List<String>> map = new HashMap();

        for(String str: strs){
            char[] letterFreq = new char[26];
            for(int i=0; i<str.length(); i++){
                letterFreq[str.charAt(i) - 'a']++;
            }

            String arrAsKey = new String(letterFreq);
            List<String> mapped = map.get(arrAsKey);
            if(mapped == null){
                mapped = new ArrayList<>();
                map.put(arrAsKey, mapped);
                ret.add(mapped);
            }
            mapped.add(str);
        }

        return ret;
    }
}
