/**
 * Created by huzaifa.aejaz on 6/27/18.
 */
public class SubtractBinary {
    public String subtract(String num1, String num2){
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int ans = a-b;
        return Integer.toString(ans);
    }
}
