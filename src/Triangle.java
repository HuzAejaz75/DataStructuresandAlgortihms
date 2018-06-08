import java.util.ArrayList;

/**
 * Created by huzaifa.aejaz on 5/23/18.
 */
public class Triangle {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int[] total = new int[triangle.size()];
        int l = triangle.size() - 1;

        for (int i = 0; i < triangle.get(l).size(); i++) {
            total[i] = triangle.get(l).get(i);
        }//fill with the last row

        // iterate from last second row
        for (int i = triangle.size() - 2; i >= 0; i--) {
            System.out.println("hy"+triangle.get(i + 1).size());
            for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) { //j 0 -> 3
                total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
            }
        }

        return total[0];
    }
}
