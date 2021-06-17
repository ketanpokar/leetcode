// Problem Link : https://leetcode.com/problems/maximum-depth-of-binary-tree/

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
class MaximumSumOfBST {
    public int maxDepth(TreeNode root) {
        return depth(root, 0);
    }
    
    public int depth(TreeNode node, int depth) {
        if(node == null) {
            return depth;
        }
        return Math.max(depth(node.left, depth + 1), depth(node.right, depth + 1));
        
    }
}
