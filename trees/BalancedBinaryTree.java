// Problem Link : https://leetcode.com/problems/balanced-binary-tree/

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
class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return depth(root, 0) != -1 ? true : false;
    }
    
    public int depth(TreeNode node, int depth) {
        if(node == null) {
            return depth;
        }
        int left = depth(node.left, depth + 1);
        int right = depth(node.right, depth + 1);
        if(Math.abs(left - right) > 1)
            return -1;
        
        return Math.max(left, right);
        
    }
}
