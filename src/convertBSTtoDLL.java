import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzaifa.aejaz on 7/16/18.
 */
public class convertBSTtoDLL {
    public TreeNode treeToDoublyList(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        inorderTraversal(root, nodes);
        int count = 0;
        for(int i = 0; i < nodes.size(); i++){
            if(i == 0){
                TreeNode node = nodes.get(i);
                TreeNode end = nodes.get(nodes.size()-1);
                node.left = end;
                end.right = node;
                if(i+1< nodes.size()){
                    TreeNode next = nodes.get(i+1);
                    node.right = next;
                }
            }
            else
            if(i < nodes.size() -1){
                TreeNode node = nodes.get(i);
                TreeNode next = nodes.get(i+1);
                TreeNode prev = nodes.get(i-1);
                node.left = prev;
                node.right = next;
            }
            else{
                TreeNode node = nodes.get(i);
                TreeNode prev = nodes.get(i-1);
                node.left = prev;
            }
        }
        return nodes.get(0);

    }

    private void inorderTraversal(TreeNode root, List<TreeNode> list){
        if(root==null) return;
        inorderTraversal(root.left,list);
        list.add(root);
        inorderTraversal(root.right,list);
    }
}
