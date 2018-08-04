import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 8/3/18.
 */
public class removeKDigits {
    public String removeKdigits(String num, int k) {
        int digits = num.length() - k;
        char[] stk = new char[num.length()];
        int top = 0;
        // k keeps track of how many characters we can remove
        // if the previous character in stk is larger than the current one
        // then removing it will get a smaller number
        // but we can only do so when k is larger than 0
        for (int i = 0; i < num.length(); ++i) {
            char c = num.charAt(i);
            while (top > 0 && stk[top-1] > c && k > 0) {
                top -= 1;
                k -= 1;
            }
            stk[top++] = c;
        }
        // find the index of first non-zero digit
        int idx = 0;
        while (idx < digits && stk[idx] == '0') idx++;
        return idx == digits? "0": new String(stk, idx, digits - idx);
    }
    public String removeKdigits2(String num, int k) {
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < num.length(); i++)
        {
            list.add(num.charAt(i));
        }

        if(list.size()==k){
            return "0";
        }
        int size = list.size();
        int range = size - k;
        for(int i = 0; i < k; i++)
        {

            int indx = search(list, 0, k);
            list.remove(indx);

        }
        String res = "";
        if(list.size() > 0)
        {
            for(Character ch : list){
                if(res.length()==0 && ch =='0') continue;
                res += ch;
            }
        }
        return res;
    }
    private int search(List<Character> list, int start, int end){
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = 0; i < Math.min(list.size(), end) ; i++){
            if(list.get(i)-'0' > max){
                maxIndex = i;
                max = list.get(i)-'0';
            }
        }
        return maxIndex;
    }
}
