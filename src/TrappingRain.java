import java.util.List;

/**
 * Created by huzaifa.aejaz on 9/5/18.
 */
public class TrappingRain {
   /* public int trap(int[] height){
        int ans = 0;
        int size = height.length;
        for (int i = 1; i < size - 1; i++) {
            int max_left = 0, max_right = 0;
            for (int j = i; j >= 0; j--) { //Search the left part for max bar size
                max_left = Math.max(max_left, height[j]);
            }
            for (int j = i; j < size; j++) { //Search the right part for max bar size
                max_right = Math.max(max_right, height[j]);
            }
            ans += Math.min(max_left, max_right) - height[i];
        }
        return ans;
    }*/

   public int trapDP(int[] height)
   {
       int ans = 0;
       int size = height.length;
       int[] left = new int[size];
       left[0] = height[0];
       for(int i = 1; i < size; i++){
           left[i] = Math.max(height[i], left[i-1]);
       }
       int[] right = new int[size];
       right[0] = height[size-1];
       for(int i = size-2; i >= 0; i--){
           right[i] = Math.max(height[i], right[i+1]);
       }

       for(int i = 1; i < size-1; i++){
           ans += Math.min(left[i],right[i])-height[i];
       }
       return ans;

   }
}
