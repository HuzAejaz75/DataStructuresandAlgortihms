import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by huzaifa.aejaz on 5/18/18.
 */
public class Main {
    public static void main(String[] args) {
       Integer obj  = new Integer(2);

        System.out.println(Integer.valueOf("123"));

      /*  NumberOfIslands NOI = new NumberOfIslands();
        char[][] grid = {{'1','1','1','1'},{'0','1','0','0'},{'1','1','1','1'}};
        NOI.numIslands(grid);

        constructUsingInandPre CUI = new constructUsingInandPre();
        ConstructusingPost CUP = new ConstructusingPost();

        int[] inorder = {9,3,15,20,2,7,4};
        int[] preorder = {3,9,20,15,7,2,4};
        int[] postorder = {9,15,2,4,7,20,3};
        CUI.buildTree(preorder,inorder);
        CUP.buildTree(inorder,postorder);*/

       /* DutchNationalFlag DNF = new DutchNationalFlag();
        int[] nums = {1,1,1,2,0,0,2};
        System.out.println(Arrays.toString(DNF.sortColors(nums)));
*/
       // ExcelSheetName ESN = new ExcelSheetName();
       // System.out.printf(ESN.convertToTitle(701));
        /*DecodeWays DW = new DecodeWays();
        DW.numDecodings("11245");*/
        /*SubtractBinary Sb = new SubtractBinary();
        System.out.println(Sb.subtract("1","110"));
        int[] nums = {-4,-5};
        NumArray NA = new NumArray(nums);
        NA.sumRange(0,0);
        NA.sumRange(1,1);
        NA.sumRange(0,1);*/

        /*
        TreeNode root = new TreeNode(5);
        TreeNode one = new TreeNode(3);
        TreeNode two = new TreeNode(6);
        TreeNode three = new TreeNode(2);
        TreeNode four = new TreeNode(4);
        three.left = null;
        three.right = null;
        four.left= null;
        four.right=null;
        one.left = three;
        one.right = four;
        root.left = one;
        root.right = two;
        two.left = null;
        two.right = null;

        LowestCommonAncestor LCA = new LowestCommonAncestor();
        LCA.lowestCommonAncestor(root,four,two);*/


       /* Scramble scr = new Scramble();
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

        LR lr = new LR(5);
        lr.put(1,1);
        lr.put(2,2);
        lr.put(3,3);
        lr.get(1);
        lr.put(4,4);
        lr.put(5,5);
        lr.put(11,11);
        lr.get(3);
        lr.get(2);*/

       LFUMethod2 cache = new LFUMethod2(2);
        cache.set(1, 1);
        cache.set(2, 2);
        cache.get(1);       // returns 1
        cache.set(3, 3);    // evicts key 2
        cache.get(2);       // returns -1 (not found)
        cache.get(3);       // returns 3.
        cache.set(4, 4);    // evicts key 1.
        cache.get(1);       // returns -1 (not found)
        cache.get(3);       // returns 3
        cache.get(4);



    }
}
/*

"--a-a-a-a--"
2
 */
