import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 8/4/18.
 */
public class subArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
   /* public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        List<Integer> sumArray = new ArrayList<>();
        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            sumArray.add(sum);
            if(hash.size()>0 && hash.containsKey(sum%k)){
                int val = sum -sumArray.get(hash.get(sum%k));
                System.out.println(val);
                if(val ==5)
                    count++;
                hash.put(sum%k,i);
            }
            else{
                hash.put((sum)%k,i);
            }
        }
        return count;
    }*/
}
