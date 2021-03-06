import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 7/10/18.
 */
public class InvalidParenthesis {
   public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();//result
        remove(s, ans, 0, 0, new char[]{'(', ')'});
        return ans;//returned
    }

    public void remove(String s, List<String> ans, int last_i, int last_j,  char[] par) {

        for (int stack = 0, i = last_i; i < s.length(); ++i) {
            if (s.charAt(i) == par[0]) stack++;
            if (s.charAt(i) == par[1]) stack--;
            if (stack >= 0) continue;
            for (int j = last_j; j <= i; ++j)
                if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) == par[0]))
                    remove(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, par);
            return;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if (par[0] == '(') // finished left to right
            remove(reversed, ans, 0, 0, new char[]{')', '('});
        else // finished right to left
            ans.add(reversed);
    }

  /*  public String removeInvalidParentheses(String s) {
        String r = remove(s, new char[]{'(', ')'});
        String tmp = remove(new StringBuilder(r).reverse().toString(), new char[]{')', '('});
        return new StringBuilder(tmp).reverse().toString();
    }
    private String remove(String s, char[] p) {
        int stack = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == p[0])		stack++;
            if (s.charAt(i) == p[1])		stack--;
            if (stack < 0) {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
                stack = 0;
            }
        }
        return s;
    }
*/
}
