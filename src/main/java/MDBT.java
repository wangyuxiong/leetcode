/**
 * Created by metaboy on 16/5/13.
 */
public class MDBT {

    /**
     *  Maximum Depth of Binary Tree
     *
     * Given a binary tree, find its maximum depth.
     *
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     *
     * Subscribe to see which companies asked this question
     *
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftLength = 1;
        int rightLength = 1;

        if(root.left != null){
            leftLength = leftLength + maxDepth(root.left);
        }
        if(root.right != null){
            rightLength = rightLength + maxDepth(root.right);
        }

        if(leftLength > rightLength){
            return leftLength;
        }else{
            return rightLength;
        }
    }

    //Definition for a binary tree node.
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}



