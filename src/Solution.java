import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 7/17/18.
 */
public class Solution {
     void wordCountEngine(String document) {
        // your code goes here
        HashMap<Integer, ArrayList<String>> fmap = new HashMap<Integer, ArrayList<String>>();
        HashMap<String, Integer> wmap = new HashMap<String, Integer>();
        List<Integer> frequencies = new ArrayList<Integer>();
        String[] words = document.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (wmap.containsKey(words[i])) {
                int c = wmap.get(words[i]);
                wmap.put(words[i], ++c);
            } else {
                wmap.put(words[i], 1);
            }
        }

        for (String s : wmap.keySet()) {
            int count = wmap.get(s);
            frequencies.add(count);
            if (fmap.containsKey(count)) {
                ArrayList<String> el = fmap.get(count);
                el.add(s);
            } else {
                ArrayList<String> nl = new ArrayList<String>();
                nl.add(s);
                fmap.put(count, nl);
            }
        }

        Collections.sort(frequencies, Collections.reverseOrder());

        String[][] result = new String[fmap.size()][2];


         int k =0;
         for(int i : frequencies){
             ArrayList<String> l = fmap.get(i);
             for(String s: l){
                 result[k][0] = s;
                 result[k][1] = String.valueOf(i);
                 k++;
             }
         }

     }
}
