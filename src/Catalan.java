/**
 * Created by huzaifa.aejaz on 7/24/18.
 */
public class Catalan {
    public int catalan( int n)
    {
        // Base case
        if (n <= 1) return 1;

        // catalan(n) is sum of catalan(i)*catalan(n-i-1)
        int res = 0;
        for (int i=0; i<n; i++)
            res += catalan(i)*catalan(n-i-1);

        return res;
    }
}
