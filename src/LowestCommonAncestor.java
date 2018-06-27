import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 6/26/18.
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        List<TreeNode> pList = new ArrayList<>();
        List<TreeNode> qList = new ArrayList<>();
        helper(root, p, pList);
        helper(root, q, qList);
        int ptr = 0;
        TreeNode LCA = null;
        while(ptr < pList.size() && ptr < qList.size()){
            TreeNode pNode = pList.get(ptr);
            TreeNode qNode = qList.get(ptr);

            if(pNode.val == qNode.val){
                LCA = pNode;
            }
            ptr++;
        }
        return LCA;
    }

    private void helper(TreeNode root, TreeNode node, List<TreeNode> list){
        if(root.val == node.val){
            list.add(root);
            return;
        }
        else{
            list.add(root);
            if(node.val < root.val){

                helper(root.left,node,list);
            }
            else{

                helper(root.right,node,list);

            }
        }

    }
}
