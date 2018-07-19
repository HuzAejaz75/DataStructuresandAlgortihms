import java.util.HashMap;
import java.util.Map;

/**
 * Created by huzaifa.aejaz on 7/18/18.
 */
public class maxSubArray2 {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            // if (!preSum.containsKey(sum)) preSum.put(sum, i);
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
