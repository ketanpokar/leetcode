// Problem Link : https://leetcode.com/problems/range-sum-of-bst/

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
class RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        
        while(root != null) {
            
            if(low <= root.val && root.val <= high) {
                sum = sum + root.val;
            }
            sum = sum + rangeSumBST(root.left, low, high);
            sum = sum + rangeSumBST(root.right, low, high);
            
            
        }
        return sum;
    }
}
