/**
 * Created by huzaifa.aejaz on 6/27/18.
 */
public class  ExcelSheetName {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            result.insert(0, (char)('A'+  n % 26));
            n /= 26;
        }

        return result.toString();
    }
}
