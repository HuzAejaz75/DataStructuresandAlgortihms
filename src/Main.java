import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 5/18/18.
 */
public class Main {
    public static void main(String[] args) {

        TrappingRain TR = new TrappingRain();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        TR.trap(height);
        /*findAllAnagrams FAA = new findAllAnagrams();
        FAA.findAnagrams("cbaebabacd","abc");
        anagram ana = new anagram();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ana.findAnagrams(strs);*/
      /*  TopKFrequentWords TKF = new TopKFrequentWords();
        String[] words = {"boon","boon","boon","sun","sun","earth","zen","zen","zen","cag","cag","cag","cag"};
        TKF.topKFrequent(words, 2);*/
       /* BTS_cooldown BS = new BTS_cooldown();
        int[] num = {6,5,4,2,1,16,19};
        BS.maxProfit(num);*/
      /*  String word = "leetcode";
        char[] arr = word.toCharArray();
        List<Character> list = new ArrayList<>();

        for(char ch : arr){
            if(list.size()==0 || !list.contains(ch)){
                list.add(ch);
            }
            else{
                list.remove(ch);
            }
        }
        for(char cha : list){
            System.out.println(cha);
        }
*/
       /* DuplicateSubTreesInBT DST = new DuplicateSubTreesInBT();
        TreeNode node = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(2);
        TreeNode node6 = new TreeNode(4);
        TreeNode node7  = new TreeNode(4);
        node.left = node2;
        node.right = node4;
        node2.left = node3;
        node2.right = null;
        node4.left = node5;
        node4.right = node6;
        node5.left = node7;
        BoundaryOfBinaryTree BBT = new BoundaryOfBinaryTree();
        BBT.boundaryOfBinaryTree(node);
        DST.findDuplicateSubtrees(node);*/
       /* CountingBits CB = new CountingBits();
        CB.countingBits2(25);

       courseSchedule2 CS2 = new courseSchedule2();
        int[][] preReq = new int[][] {{0,3},{2,3},{1,0},{1,2}};
        CS2.findOrder(4, preReq);
       courseSchedule1 CS1 = new courseSchedule1();*/

     // int[][] preReq = new int[][] {{0,3},{2,3},{1,0},{1,2}};
     //   CS1.canFinish(4, preReq);

       /* largestRectangle lr = new largestRectangle();
        int[] heights = {6, 7, 5, 2, 4, 5, 9, 3};
        lr.largestRectangleArea(heights);*/
       /* largestNumber LN = new largestNumber();
        int[] nums = {943,94,56,32,3,45,67};
        LN.largestNumber(nums);*/
     //   removeKDigits rkd = new removeKDigits();
       // System.out.println(rkd.removeKdigits("10200", 1));
/*
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        List<Integer> list3 = new ArrayList<>();
        list3.add(9);
        list3.add(10);
        list3.add(11);

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);
        result.add(list3);

        zigzagIterator ZZI = new zigzagIterator(result);
        while(ZZI.hasNext()){
            System.out.println(ZZI.next());
        }
*/
       /* RandomizedCollection RC = new RandomizedCollection();
        RC.insert(3);
        RC.insert(4);
        RC.insert(6);
        RC.insert(5);
        RC.insert(6);
        RC.insert(6);

        RC.remove(6);
        RC.remove(4);

        longestSubstringWithoutRepeatingCharacters lsc =  new longestSubstringWithoutRepeatingCharacters();
        lsc.lengthOfLongestSubstring("abcaccb");*/
/*
        ringBuffer rb = new ringBuffer(3);
        rb.enQueue(5);
        rb.enQueue(6);
        rb.enQueue(7);
        System.out.println(rb.deQueue());
        rb.enQueue(8);

        letterCasePermutation LCP = new letterCasePermutation();
        LCP.letterCasePermutation2("a2b2");*/
       /* SerializeAndDeserialize Snd = new SerializeAndDeserialize();
        TreeNode node1 = new TreeNode(2);
        TreeNode node1l = new TreeNode(3);
        TreeNode node1r = new TreeNode(4);
        node1.left = node1l;
        node1.right = node1r;
        String str = Snd.serialize(node1);
        Snd.deserialize(str);*/
/*
       reorderList RL = new reorderList();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
       RL.reorderList(l1);
*/

       /* KMP_Algorithm KMPA = new KMP_Algorithm();
        KMPA.KMPSearch("abababd","ababcabcabababd");*/
        /*NextGreaterPermutation NGP = new NextGreaterPermutation();
        int[] nums = {1,2,3,6,4,5};
        NGP.nextPermutation(nums);*/
       /* PermutationInString PIS = new PermutationInString();
        PIS.checkInclusion("ab","eidbaooo");*/
        /*WindowSliding WS = new WindowSliding();
        int[] nums = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        WS.maxSum(nums, nums.length,4);*/
       /* BasicCalculator2 BS2 = new BasicCalculator2();
        BS2.calc("13+2/2");*/
       /* StrobogrammaticNumber SBG = new StrobogrammaticNumber();
        SBG.findStrobogrammatic(4);*/
       // LRU_Cache LR = new LRU_Cache();
       // LR.
      /*  int[] stones = {0,1,3,6,10,13,15,18};//{0,1,2,3,4,8,9,11};
        FrogJump FJ = new FrogJump();
        FJ.canCross(stones);*/
       /* AlienDictionary AD = new AlienDictionary();
        String[] words = {"wrt", "wrf",
                "er",
                "ett",
                "rftt"};
        AD.alienOrder(words);*/
/*
        convertBST CB = new convertBST();
        TreeNode node = new TreeNode(20);
        TreeNode node2 = new TreeNode(15);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(18);
        TreeNode node5 = new TreeNode(25);
        node.left = node2;
        node.right = node5;
        node2.left = node3;
        node2.right = node4;

        CB.treeToDoublyList(node);
*/
      /*  palindromePairs pp = new palindromePairs();
        String[] str = {"bat", "tab", "cat"};
        pp.palindromePairs(str);*/
/*
        subArraySumEqualsK SAA = new subArraySumEqualsK();
        int[] nums = {1,2,3,4,1,2,2,1};
        System.out.println(SAA.subarraySum(nums,5));*/
       /* QuickSort QS = new QuickSort();
        int[] nums = {3,2,1,5,6,4};
        QS.quickMain(nums);

        KthKargestElement KLE = new KthKargestElement();
        int[] nums2 = {7,2,1,5,6,4};
        KLE.findKthLargest(nums2,2);*/
       /* removeKDigits rk = new removeKDigits();
        System.out.println(rk.removeKdigits2("10200", 1));*.
       /* maximumSwap MS = new maximumSwap();

        MS.maximumSwap2(98368);*/
      /*  ReverseLinkedList RLL = new ReverseLinkedList();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        RLL.reverseList(l1);*/
        /*ContinuousSubArraySum CSA = new ContinuousSubArraySum();
        int[] nums = {1,1,3,4,19};
        CSA.checkSubarraySum(nums,7);*/
       /* CS1 cs1 = new CS1();
        int[][] nums = {{1,0},{0,1}};
        cs1.canFinish(2, nums);*/
      /* NumberOfConnectedComponents NOC = new NumberOfConnectedComponents();
       int[][] edges = {{2,3}, {1, 2}, {1,3}};
       NOC.countComponents2(4, edges);
       int[][] nums = {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        friendCircles FC = new friendCircles();
        FC.findCircleNum(nums);*/
       //Graph graph = new Graph(4);


        //BFS_FIset1 BF1 = new BFS_FIset1();
       // BF1.reconstructPath()
       /* LongestCommonSubSequence LCS = new LongestCommonSubSequence();
        String str1 = "abcde";
        String str2 = "zbcd";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        LCS.lcs(ch1,ch2,ch1.length,ch2.length);
        longestincreasingsubsequence LIS = new longestincreasingsubsequence();
        int[] nums = {0,8,4,12,2};
        LIS.LIS3(nums);*/
       /* longestincreasingsubsequence lis = new longestincreasingsubsequence();
        int[] nums = {0,8,4,12,2};
        lis.lengthOfLIS(nums);*/
     /*  UnionFindAccountsMerge UFA = new UnionFindAccountsMerge();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list1.add("john");
        list1.add("john@gmail.com");
        list1.add("john2@gmail.com");

        list2.add("john");
        list2.add("johnb@gmail.com");
        list2.add("johnc@gmail.com");

        list3.add("john");
        list3.add("john@gmail.com");
        list3.add("john4@gmail.com");

        List<List<String>> acc = new ArrayList<>();
        acc.add(list1);
        acc.add(list2);
        acc.add(list3);

        UFA.accountsMerge(acc);*/
       /*int[] nums = {1,2,2,2,2,2,2,3,3,3,3,3,3,3,3};
       for(int i = 0; i < 50; i++){
           RandomPickIndex RPI = new RandomPickIndex(nums);
           System.out.println("ha"+RPI.pick(3));
       }
*/
      /*  int[] nums = {1,2,3,4,5,6,1,2,3,4,5,1,1,23,12,3,13,4,4,4,5,5,6,3,2,3,4,56,4,3,32,3,4,5,6,7,5,6,7,5,9,2,3,4};
        RandomPickIndex RPI = new RandomPickIndex(nums);
        RPI.pick(3);*/
        /*SplitArrayLargestSum SPA = new SplitArrayLargestSum();
        int[] nums = {7,2,5,10,8};
        SPA.splitArray(nums,2);*/
        /*GraphValidTree GVT = new GraphValidTree();
        int[][] nums =  {{0,1}, {1,2}, {2,3}, {1,3}, {1,4}};
        GVT.validTree(5, nums);*/
       /* PalindromePermutation0n PP = new PalindromePermutation0n();
        System.out.println(PP.canPermutePalindrome("code"));*/
       /* LongestPalindrome LP = new LongestPalindrome();
        LP.longestPalindrome("ghmmnxxxxzz");*/
        //RegExpressionMatch Regex = new RegExpressionMatch();
        //Regex.isMatch("aa", "a*");
       /* maxSubArray3 MSA3 = new maxSubArray3();
        int[] nums = {-5,10,2,-15,3,4,6,9,-10};
        System.out.println(MSA3.maxSubArray(nums));*/
       // PalindromicSubstring PS = new PalindromicSubstring();
        //PS.longestPalindrome("babad");
     /*   MinStack MS = new MinStack();
        MS.push(8);
        MS.push(7);
        MS.push(6);
        MS.push(13);
        MS.push(4);
        while(MS.stack.size()>0){
            System.out.println(MS.pop() + " min -> "+ MS.getMin());
        }*/

        /* Catalan ctln = new Catalan();
         ctln.catalan(5);*/
       /* cornerRectangles CR = new cornerRectangles();
        int[][] arr = {{1,1,1},{1,1,1},{1,1,1}};
        CR.countCornerRectangles(arr);*/

      //  RotateImage RI = new RotateImage();
      //  int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
       // RI.rotate(arr);
     /*   sparseMatrixMultiplication SPM = new sparseMatrixMultiplication();
        int[][] A = {{1, 0, 0}, {-1, 0, 3}};
        int[][] B = {{7, 0, 0}, { 0, 0, 0 }, {0, 0, 1 }};
        SPM.multiply(A, B);*/
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
       /*Dungeons Dg = new Dungeons();
       int[][] du = {{-1,-1,-2,-7},{2,-6,8,-3},{3,5,-3,-5},{2,-7,-2,-2}};
       Dg.calculateMinimumHP(du);*/

       /*
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
     /*  wordBreak wb = new wordBreak();
        List<String> leet = new ArrayList<>();
        leet.add("leet");
        leet.add("code");
        wb.wordBreak("leetcode",leet);*/
       // String abc = "avc";
       // System.out.println(abc.substring(abc.length(),abc.length()));

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
      //  MS.multiply("123","45");
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
      /*  wordLadder wl = new wordLadder();
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
      /*DecodeWays DW = new DecodeWays();
         DW.numDecodings("02321");*/
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
