import java.util.Stack;

/**
 * Created by huzaifa.aejaz on 7/9/18.
 */
public class inorderTraversal {
    public void inorderTraversal(TreeNode root) {
        if (root == null)
            return;


        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode curr = root;

        // traverse the tree
        while (curr != null || s.size() > 0) {

            /* Reach the left most Node of the
            curr Node */
            while (curr != null) {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }

            /* Current must be NULL at this point */
            curr = s.pop();

            System.out.print(curr.val + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }
    }
}
