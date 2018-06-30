/**
 * Created by huzaifa.aejaz on 6/28/18.
 */
public class inorderSpecialTree {

    public TreeNode binaryTree(int[] inorder, int start, int end, TreeNode node){
        if(start > end){
            return null;
        }
        int i = max(inorder,start,end);
        node = new TreeNode(inorder[i]);
        if(start==end){
            return node;
        }
        node.left = binaryTree(inorder, start, i-1, node.left);
        node.right = binaryTree(inorder,i+1,end, node.right);
        return node;
    }

    private int max(int[] arr, int start,int end){
        int maxVal=arr[start];
        int maxIndex=start;
        for(int i = start; i < end; i++){
            if(arr[i]>maxVal){
                maxVal = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
