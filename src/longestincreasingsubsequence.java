import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 5/30/18.
 */
public class longestincreasingsubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }

    public int LIS2(int[] nums)
    {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int lo = 0, hi = size;
            while (lo != hi) {
                int m = (lo + hi) / 2;
                if (tails[m] < x)
                    lo = m + 1;
                else
                    hi = m;
            }
            tails[lo] = x;
            if (lo == size) ++size;
        }
        return size;
    }

    public void LIS3(int[] nums){//find
        ArrayList<Integer>[] group = new ArrayList[nums.length];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        group[0] = list;
        for(int i = 1; i < group.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i]> nums[j] && group[j].size() > group[i].size()){
                    group[i] = group[j];
                }
            }
            group[i].add(nums[i]);
        }
        for(List<Integer> l : group){
            System.out.println(l);
        }


    }
}
