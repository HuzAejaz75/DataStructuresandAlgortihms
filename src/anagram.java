

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 9/4/18.
 */
public class anagram {
    public List<List<String>> findAnagrams(String[] strs){
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str : strs)
        {
            char[] charArr = new char[26];
            for(int i = 0; i < str.length(); i++)
            {
                charArr[str.charAt(i)-'a']++;
            }
            String key = String.valueOf(charArr);
            System.out.println(key);
            if(!map.containsKey(key)) map.put(key,new ArrayList<>());
            map.get(key).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for(String k : map.keySet())
        {
            List<String> list = map.get(k);
            result.add(list);
        }
        return result;
    }
}

