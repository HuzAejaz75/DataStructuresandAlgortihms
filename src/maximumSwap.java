import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 8/3/18.
 */
public class maximumSwap {
    public int maximumSwap(int num) {
        HashMap<Character, Integer> hash = new HashMap<Character,Integer>();
        String str = Integer.toString(num);
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++)
        {
            hash.put(charArr[i],i);
        }
        List<Character> list = new ArrayList<>();
        for(Character c : hash.keySet())
        {
            list.add(c);
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int i = 0; i < list.size(); i++){
            if(charArr[i]==list.get(i) || charArr[i]-'0' > list.get(i)-'0') continue;
            else{
                int index = hash.get(list.get(i));
                char temp = charArr[index];
                charArr[index] = charArr[i];
                charArr[i] = temp;
                break;
            }
        }
        String maxNum = String.valueOf(charArr);
        return Integer.parseInt(maxNum);
    }

    public int maximumSwap2(int num) {
        char[] digits = Integer.toString(num).toCharArray();

        int[] buckets = new int[10];
        for (int i = 0; i < digits.length; i++) {
            buckets[digits[i] - '0'] = i;
        }

        for (int i = 0; i < digits.length; i++) {
            for (int k = 9; k > digits[i] - '0'; k--) {
                if (buckets[k] > i) {
                    char tmp = digits[i];
                    digits[i] = digits[buckets[k]];
                    digits[buckets[k]] = tmp;
                    return Integer.valueOf(new String(digits));
                }
            }
        }

        return num;
    }
}
