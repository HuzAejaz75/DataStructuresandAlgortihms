/**
 * Created by huzaifa.aejaz on 7/4/18.
 */
public class LongestIncSequence {

        private boolean arrayContains(int[] arr, int num) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    return true;
                }
            }

            return false;
        }
        public int longestConsecutive(int[] nums) {
            int longestStreak = 0;

            for (int num : nums) {
                int currentNum = num;
                int currentStreak = 1;

                while (arrayContains(nums, currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }

            return longestStreak;
        }

}
