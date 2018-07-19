import java.util.HashMap;
import java.util.Map;

/**
 * Created by huzaifa.aejaz on 7/17/18.
 */
public class maxSubArray {
    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max = 0;
        int sum = 0;
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            Integer temp = map.get(sum - k);
            if (temp != null){
                max = Math.max(max, i - temp);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return max;
    }
}
