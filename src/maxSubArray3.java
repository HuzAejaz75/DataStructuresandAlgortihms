/**
 * Created by huzaifa.aejaz on 7/25/18.
 */
public class maxSubArray3 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr_max = nums[0];
        for(int i = 1; i <nums.length; i++){
            curr_max = Math.max(nums[i], nums[i]+ curr_max);
            max = Math.max(max, curr_max);
        }
        return max;
    }
}
