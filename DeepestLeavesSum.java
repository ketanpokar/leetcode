// Problem Link : https://leetcode.com/problems/deepest-leaves-sum/

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
class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        int height = height(root, 0);
        return sum(root, 0, height, 0);
    }
    
    public int height(TreeNode root, int max) {
        if(root == null) return max;
        
        int value = Math.max(height(root.left, max  + 1), height(root.right, max + 1));
        if(max < value) 
            max = value;
        
        return max;
    }
    
    public int sum(TreeNode root, int sum, int maxHeight, int curHeight) {
        if(curHeight == maxHeight - 1 && root != null) {
            return root.val;
        }
        if(root == null) return 0;
        
        sum = sum + sum(root.left, sum, maxHeight, curHeight + 1) + sum(root.right, sum, maxHeight, curHeight + 1);
        return sum;
    }
    
}
