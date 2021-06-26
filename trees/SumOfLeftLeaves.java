// Problem Link : https://leetcode.com/problems/sum-of-left-leaves/

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
class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        int res = 0;
        if(root.left != null && root.left.left == null && root.left.right == null)
            res = root.left.val;
        else
            res = res + sumOfLeftLeaves(root.left);
        res = res + sumOfLeftLeaves(root.right);
        return res;
    }

}
