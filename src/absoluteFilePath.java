import java.util.HashMap;

/**
 * Created by huzaifa.aejaz on 6/1/18.
 */
public class absoluteFilePath {
    public int lengthLongestPath(String input) {
        if(input.equals("") || input==null ) return 0;
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        int level = 0;
        int len = 0;
        int maxLen = 0;
        hash.put(0,0);
        for(String s : input.split("\n")){
            //for each of these strings we need to find the value and process it
            level = s.lastIndexOf("\t") +1;
            len = s.length() - level;
            if(s.contains(".")){
                maxLen = Math.max(maxLen, hash.get(level)+len);
            }
            else{
                hash.put(level+1, hash.get(level)+len+1);//get the previous level
            }

        }
        return maxLen;
    }
}
