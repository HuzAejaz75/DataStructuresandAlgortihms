import java.util.ArrayList;

/**
 * Created by huzaifa.aejaz on 5/18/18.
 */
public class Main {
    public static void main(String[] args) {
        Scramble scr = new Scramble();
        scr.isScramble("rtgae","great");

        buyandSellStockWithX BX = new buyandSellStockWithX();
        int[] prices = {6,5,4,3,2,1, -2, 1};
        BX.maxProfit(prices,2);

        maximumSubArray MSA = new maximumSubArray();
        MSA.maxProduct(prices);

        longestValidParenthesis LVP = new longestValidParenthesis();
        LVP.validParenthesis("((()((()()((");

        Triangle tri = new Triangle();
        ArrayList<Integer> zero = new ArrayList<>();
        zero.add(2);
        ArrayList<Integer> one = new ArrayList<>();
        one.add(3);
        one.add(4);
        ArrayList<Integer> two = new ArrayList<>();
        two.add(6);
        two.add(5);
        two.add(7);
        ArrayList<Integer> three = new ArrayList<>();
        three.add(4);
        three.add(1);
        three.add(8);
        three.add(3);
        ArrayList<ArrayList<Integer>> tria = new ArrayList<>();
        tria.add(zero);
        tria.add(one);
        tria.add(two);
        tria.add(three);
        System.out.println(tri.minimumTotal(tria));

        Distinct d = new Distinct();
        d.numDistinct("rabbbit","rabbit");

        minCut mc = new minCut();
        mc.minCut("aabaa");

        PartitioningPalindrome PP = new PartitioningPalindrome();
        PP.minCut("aabaa");

        LicenseKey LK = new LicenseKey();
        LK.licenseKeyFormatting("--a-a-a-a--",2);

        longestsubstringwithatleastkcharacters lk = new longestsubstringwithatleastkcharacters();
        lk.longestSubstring("xaabbccdde",2);

        atmost atm = new atmost();
        atm.lengthOfLongestSubstringTwoDistinct("abacxxxbbb");

        longestincreasingsubsequence lss = new longestincreasingsubsequence();
        int[] nums = {10, 9,2,5,3,7,101,18};
        lss.lengthOfLIS(nums);

        checkandDel cd = new checkandDel();
        int[] numsa = {0,0,0};
        cd.threeSum(numsa);

        experimeter exp = new experimeter();
        exp.checkSubString();

        absoluteFilePath af = new absoluteFilePath();
        af.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext");

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        MedianofSortedArrays MS = new MedianofSortedArrays();
        MS.findMedianSortedArrays(nums1,nums2);
    }
}
/*

"--a-a-a-a--"
2
 */
