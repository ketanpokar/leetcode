// Problem Link : https://leetcode.com/problems/univalued-binary-tree/

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
class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        return checkEquality(root, root.val);
    }
    
    public boolean checkEquality(TreeNode root, int preVal) {
        if(root == null)
            return true;

        if(root.val != preVal) return false;
        
        return checkEquality(root.left, preVal) && checkEquality(root.right, preVal);
    }
}
