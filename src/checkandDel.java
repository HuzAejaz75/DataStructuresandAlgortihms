import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 5/31/18.
 */
public class checkandDel {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        helper(result, temp, nums, 0, 0,0,used);
        return result;
    }
    public void helper( List<List<Integer>> result,List<Integer> temp, int[] nums, int start, int target, int sum, boolean[] used){
        //base case
        if(temp.size()==3 &&  target==sum){
            Collections.sort(temp);
            if(!result.contains(temp))
                result.add(new ArrayList<>(temp));
        }
        else{
            for(int i = start; i < nums.length; i++){
                if(used[i]) continue;
                if(i>0 && nums[i]==nums[i-1]&&!used[i-1]) continue;
                temp.add(nums[i]);
                used[i]= true;
                helper(result, temp, nums, start+1,0,sum+nums[i],used);
                temp.remove(temp.size()-1);
                used[i]= false;
            }
        }

    }
}
