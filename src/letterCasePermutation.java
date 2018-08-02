import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by huzaifa.aejaz on 7/5/18.
 */
public class letterCasePermutation {
        public List<String> letterCasePermutation(String S) {
            List<StringBuilder> ans = new ArrayList();
            ans.add(new StringBuilder());

            for (char c: S.toCharArray()) {
                int n = ans.size();
                if (Character.isLetter(c)) {
                    for (int i = 0; i < n; ++i) {
                        ans.add(new StringBuilder(ans.get(i)));
                        ans.get(i).append(Character.toLowerCase(c));
                        ans.get(n+i).append(Character.toUpperCase(c));
                    }
                } else {
                    for (int i = 0; i < n; ++i)
                        ans.get(i).append(c);
                }
            }

            List<String> finalans = new ArrayList();
            for (StringBuilder sb: ans)
                finalans.add(sb.toString());
            return finalans;
        }

    public List<String> letterCasePermutation2(String S) {
        if (S == null) {
            return new LinkedList<>();
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(S);

        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) continue;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chs = cur.toCharArray();

                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));

                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }

        return new LinkedList<>(queue);
    }
}

