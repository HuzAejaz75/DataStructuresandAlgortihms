import Fundementals.BitWise;
import Fundementals.HeapSort;
import Fundementals.MergeSort;
import Graphs.*;

import java.util.*;

/**
 * Created by huzaifa.aejaz on 5/18/18.
 */
public class Main {
    public static void main(String[] args) {

        sparseMatrixMultiplication SPM = new sparseMatrixMultiplication();
        int[][] A = {{1, 0, 0}, {-1, 0, 3}};
        int[][] B = {{7, 0, 0}, { 0, 0, 0 }, {0, 0, 1 }};
        SPM.multiply(A, B);
       /* maxSubArray2 ms2 = new maxSubArray2();
        int[] nums = {1, -1, 5, -2, 3};
        ms2.subarraySum(nums, 3);*/
       /* maxSubArray msa = new maxSubArray();
        int[] nums = {1, -1, 5, -2, 3};
        msa.maxSubArrayLen(nums,3);*/
        /*remove_one_Invalid_parenthesis ROIP = new remove_one_Invalid_parenthesis();
        ROIP.removeInvalidParentheses("((())()");*/
      //  Solution sln = new Solution();
      //  sln.wordCountEngine(" apple is an apple is an banana");

       /* WordDictionary WD = new WordDictionary();
        WD.addWord("a");
        WD.search("a.");*/

       /* convertBSTtoDLL CBD = new convertBSTtoDLL();
        TreeNode root = new TreeNode(4);
        TreeNode l1 = new TreeNode(2);
        TreeNode r1 = new TreeNode(5);
        TreeNode l2 = new TreeNode(1);
        TreeNode r2 = new TreeNode(3);
        root.left = l1;
        root.right = r1;
        l1.left=l2;
        l1.right=r2;

        r1.left = null;
        r1.right = null;

        CBD.treeToDoublyList(root);*/
      /*  IntegerToWords itw = new IntegerToWords();
        itw.numberToWords(1234566);

*/
        /*maxArea MA = new maxArea();
        int[][] grid = {{0,1}};
        MA.maxAreaOfIsland(grid);

        regions rgn = new regions();
        char[][] board = {{'X', 'X', 'X', 'X'},{'X', 'O' ,'O', 'X'}, {'X', 'X', 'O', 'X'},{'X', 'X' ,'X' ,'X'}};
        rgn.solve(board);*/
        //HammingDistance HD = new HammingDistance();
       // HD.hammingDistance(15, 56);
       /* HeapSort HS = new HeapSort();
        int[] arr = {7,90,6,2,4};
        HS.sort(arr);
        System.out.println(Arrays.toString(arr));*/
       /* MergeSort MS = new MergeSort();
        int[] arr = {7,90,6,2,4,17,25,26,67,78};
        MS.sort(arr,0,arr.length);*/
       /* QuickSort QS = new QuickSort();
        int[] arr = {7,90,6,2,4,17,25,26,67,78};
        QS.quickMain(arr);*/
       // FencePaint FP = new FencePaint();
       // FP.numWays(3,3);
        /*WallsAndGates WG = new WallsAndGates();
        int[][] matrix = {{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
        WG.wallsAndGates(matrix);*/

       // fibonacci fib = new fibonacci();
       // System.out.println(fib.fibonacci(45));
    //   InvalidParenthesis IP = new InvalidParenthesis();
      //  IP.removeInvalidParentheses("(()))())");

       /* inorderTraversal ioT = new inorderTraversal();
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
        ioT.inorderTraversal(root);*/

 //   productOfArrayExceptSelf pro = new productOfArrayExceptSelf();
  //  int[] nums = {6,0,5,9};
   // pro.productExceptSelf(nums);
       // String str = "a";
      //  System.out.println(str.startsWith("a"));
      /*  BrickWalls BW = new BrickWalls();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        result.add(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(1);
        list2.add(2);
        result.add(list2);


        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(4);
        result.add(list3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(1);
        list4.add(2);
        result.add(list4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(3);
        list5.add(1);
        list5.add(1);
        result.add(list5);


        BW.leastBricks(result);*/
       // BitWise BW = new BitWise();
       // BW.andOper();
      /* Dungeons Dg = new Dungeons();
       int[][] du = {{-1,-1,-2,-7},{2,-6,8,-3},{3,5,-3,-5},{2,-7,-2,-2}};
       Dg.calculateMinimumHP(du);
        mergeKSorted mks = new mergeKSorted();

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(5);
        ListNode a4 = new ListNode(7);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = null;

        ListNode b1 = new ListNode(2);
        ListNode b2 = new ListNode(4);
        ListNode b3 = new ListNode(6);
        ListNode b4 = new ListNode(8);


        b1.next=b2;
        b2.next=b3;
        b3.next=b4;
        b4.next=null;

        ListNode c1 = new ListNode(-3);
        ListNode c2 = new ListNode(-1);
        ListNode c3 = new ListNode(9);
        ListNode c4 = new ListNode(10);
        c1.next=c2;
        c2.next=c3;
        c3.next=c4;
        c4.next=null;

        ListNode[] arr = {a1,b1,c1};
        mks.mergeKLists(arr);*/
        /*PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(12);
        pq.add(13);
        pq.add(3);
        pq.add(7);
        pq.add(17);
        System.out.println(Arrays.toString(pq.toArray()));
        pq.poll();
        System.out.println(Arrays.toString(pq.toArray()));
        pq.poll();
        System.out.println(Arrays.toString(pq.toArray()));
        pq.poll();
        System.out.println(Arrays.toString(pq.toArray()));*/
      /*  wordBreak2 WB2 = new wordBreak2();
        Set<String> words = new HashSet<>();
        words.add("a");
        words.add("grey");
        words.add("hound");
        words.add("agrey");
        words.add("houn");


        WB2.wordBreak("agreyhound",words);*/
       /* wordBreak wb = new wordBreak();
        List<String> leet = new ArrayList<>();
        leet.add("leet");
        leet.add("code");
        wb.wordBreak("leetcode",leet);*/
       // String abc = "avc";
       // System.out.println(abc.substring(abc.length(),abc.length()));
      //  letterCasePermutation LCP = new letterCasePermutation();
     //   LCP.letterCasePermutation("a2b2");
        //    sqrt sq = new sqrt();
         //   sq.mySqrt(400);
       /* FindNumberOfSeq FNS = new FindNumberOfSeq();
        int[] nums = {1,3,5,4,7};
        FNS.findNumberOfLIS(nums);
*/
       /* LongestIncSequence LIS = new LongestIncSequence();
        int[] nums = {100, 4, 200, 1, 3, 2};
        longestincrSubSeque lcs = new longestincrSubSeque();
        lcs.longestConsecutive(nums);*/
        //LIS.longestConsecutive(nums);
       // Manachers_Algorithm MA = new Manachers_Algorithm();
     //   MA.countSubstrings("abaaca");

        /*PalindromeCheck PC = new PalindromeCheck();
        PC.countSubstrings("abaaca");*/
       // String s = "avc";
        //System.out.println(s.substring(0,1));
     //   multipleStrings MS = new multipleStrings();
     //   MS.multiply("123","123");
        /*CS3 cs = new CS3();
        int[][] courses = {{0,1}};
        cs.findOrder(2,courses);*/
     /*  TaskScheduler TS = new TaskScheduler();
        char[] tasks = {'A','A','A','B','B','C'};
        TS.leastInterval(tasks,4);*/
        /*GroupAnagrams GA = new GroupAnagrams();
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GA.groupAnagrams(str);*/
       /* SkyLineProblem SLP = new SkyLineProblem();
        int[][] buildings = {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
        //[2 9 10], [3 7 15], [5 12 12], [15 20 10], [19 24 8]
        SLP.getSkyline(buildings);*/
       /* */
    //    CourseSchedule2 CS2 = new CourseSchedule2();
      //  int[][] preReq = {{1,0}};
        //CS2.findOrder(2,preReq);
/*
        DepthFirstSearch DFS = new DepthFirstSearch();
        List<String>  list= new ArrayList<>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("loc");
        list.add("coc");
        list.add("log");
        list.add("cog");
        DFS.findLadders("hit","cog",list);

        */

       /* CourseSchedule CS = new CourseSchedule();
        int[][] graphList = {{1,0},{2,0},{2,1}};
        CS.canFinish(3, graphList);*/
       /* wordLadder wl = new wordLadder();
        String a = "hit";
        String b = "cog";
        Set<String> set = new HashSet<>();


        set.add("akcd");
        set.add("akcf");
        set.add("aknd");
        set.add("aknl");
        set.add("akgl");
        set.add("ekgl");
        set.add("afgl");
        set.add("afgx");
        set.add("fgx");
        set.add("efgx");
        set.add("efgh");

        List<String> list = new ArrayList<>();
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");

        wl.ladderLength(a,b,list);*/

     //  Integer obj  = new Integer(2);

       // System.out.println(Integer.valueOf("123"));

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
      //  ExcelSheetName ESN = new ExcelSheetName();
      //  System.out.printf(ESN.convertToTitle(3));
       DecodeWays DW = new DecodeWays();
        DW.numDecodings("123");
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

      /* LFUMethod2 cache = new LFUMethod2(2);
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
*/


    }
}
/*

"--a-a-a-a--"
2
*/
