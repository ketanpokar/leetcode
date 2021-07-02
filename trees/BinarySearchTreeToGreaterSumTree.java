// Problem Link : https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

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
class BinarySearchTreeToGreaterSumTree {
    int value = 0;
    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }
    
    public void traverse(TreeNode root) {
        if(root == null) return;
        
        traverse(root.right);
        root.val = value + root.val;
        value = root.val;
        traverse(root.left);
    }
}
