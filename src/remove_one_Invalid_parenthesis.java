/**
 * Created by huzaifa.aejaz on 7/17/18.
 */
public class remove_one_Invalid_parenthesis {
    public String removeInvalidParentheses(String s) {
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
}
