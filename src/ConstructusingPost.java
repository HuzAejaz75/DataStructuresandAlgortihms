/**
 * Created by huzaifa.aejaz on 6/28/18.
 */
public class ConstructusingPost {



        private TreeNode doBuildTree(int[] inorder, int inleft, int inright, int[] postorder,int postleft, int postright) {
            if (inleft > inright)
                return null;

            TreeNode node = new TreeNode(postorder[postright]);
            int inmiddle = 0;
            for (int i = inleft; i <= inright; ++i) {
                if (inorder[i] == postorder[postright]) {
                    inmiddle = i;
                    break;
                }
            }
            node.left = doBuildTree(inorder, inleft, inmiddle - 1, postorder, postleft, postleft + inmiddle - inleft - 1);
            node.right = doBuildTree(inorder, inmiddle + 1, inright, postorder, postleft + inmiddle - inleft, postright - 1);
            return node;
        }

        public TreeNode buildTree(int[] inorder, int[] postorder) {
            if (inorder.length == 0)
                return null;

            return doBuildTree(inorder, 0, inorder.length -1 , postorder, 0, postorder.length - 1);
        }
}

