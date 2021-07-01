// Problem Link : https://leetcode.com/problems/minimum-absolute-difference-in-bst/

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
class MinimumAbsoluteDifferenceInBST {
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min3;
    }
    int min1 = 100001;
    int min2 = 100001;
    int min3 = 100001;
    public void inOrder(TreeNode root) {
        if(root == null) return;
        
        inOrder(root.left);
        
        min2 = min1;
        min1 = root.val;
        if(Math.abs(min2-min1) < min3) {
            min3 = Math.abs(min2-min1);
        }
        inOrder(root.right);
    }
}
