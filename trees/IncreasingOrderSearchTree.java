// Problem Link : https://leetcode.com/problems/increasing-order-search-tree/

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
class IncreasingOrderSearchTree {
    TreeNode result = null, temp = null;
    public TreeNode increasingBST(TreeNode root) {
        create(root);
        return temp;
    }
    
    public void create(TreeNode root) {
        if(root == null) 
            return;
        
        create(root.left);
        
        if(result == null) {
            result = new TreeNode(root.val);
            temp = result;
            
        } else {
            result.right = new TreeNode(root.val);
            result = result.right;
        }

        create(root.right);
    }
}
