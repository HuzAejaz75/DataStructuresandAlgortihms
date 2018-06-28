/**
 * Created by huzaifa.aejaz on 6/27/18.
 */
public class RangeSum {
    class NumArray {
        int[] arr;
        public NumArray(int[] nums) {
            arr = nums;
        }

        public int sumRange(int i, int j) {
            int sum = 0;
            for(int curr = 0; curr <= i; curr++){
                if(curr == i){
                    while(curr <= j){
                        sum += arr[curr];
                        curr++;
                    }
                }
                curr++;
            }
            return sum;
        }
    }
}
