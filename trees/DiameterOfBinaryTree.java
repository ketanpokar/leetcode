// Problem Link :https://leetcode.com/problems/diameter-of-binary-tree/

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
import java.util.concurrent.atomic.AtomicInteger;
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        height(root);
        
        return max.get();
    }

    AtomicInteger max = new AtomicInteger(0);
    public int height(TreeNode root) {
        if(root == null) return 0;
        
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        
        if((lHeight + rHeight) > max.get()){
            max.set(lHeight + rHeight);
        }
        
        return Math.max(lHeight, rHeight) + 1;
    }
}
