/**
 * Created by huzaifa.aejaz on 9/30/18.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        for(int i = 1; i < n; i++)
        {
            String temp = sb.toString();
            sb = new StringBuilder();
            int count = 1;
            char ch = temp.charAt(0);
            int len = temp.length();
            for(int j = 1; j < len; j++)
            {
                if(temp.charAt(j)==ch)
                {
                    count++;
                }
                else
                {
                    sb.append(count).append(ch);
                    ch = temp.charAt(j);
                    count = 1;
                }
            }
            sb.append(count).append(ch);
        }
        return sb.toString();
    }
}
