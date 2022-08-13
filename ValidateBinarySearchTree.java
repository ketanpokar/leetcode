// Problem link : https://leetcode.com/problems/validate-binary-search-tree/

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
    public boolean isValidBST(TreeNode root) {
        return validate2(root, new AtomicLong(Long.MIN_VALUE));
    }
    
    public boolean validate2(TreeNode root, AtomicLong min) {
        if(root == null) return true;
        
        boolean left = validate2(root.left, min);
        if(min.get() >= root.val) {
            return false;
        } else {
            min.set(root.val);
        }
        boolean right = validate2(root.right, min);
        return left && right;
    }
}
