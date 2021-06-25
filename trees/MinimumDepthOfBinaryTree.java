// Problem Link : 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        return height(root, 0);
    }
    
    public int height(TreeNode root, int height) {
        if(root == null)  return height;
        if(root.right == null && root.left == null) {return height + 1;}
        else if(root.right == null) {return height(root.left, height + 1);}
        else if(root.left == null) {return height(root.right, height + 1);}
        else return Math.min(height(root.left, height + 1), height(root.right, height + 1));
    }
}
