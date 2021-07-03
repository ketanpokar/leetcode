// Problem Link : https://leetcode.com/problems/path-sum/

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
class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null) return false;
        //if(targetSum == 0) return false;
        if(root.left != null && root.right != null) {
            return find(root, targetSum);
        } else if(root.left != null && root.right == null) {
            return find(root.left, targetSum - root.val);
        } else if(root.left == null && root.right != null) {
            return find(root.right, targetSum - root.val);
        } else if(root.val == targetSum) {
            return true;
        }
        
//         if(root == null) return false;
        
//         return find(root, 0, targetSum);
        
        
        return false;
    }
    
//     public boolean find(TreeNode root, int curSum, int targetSum) {
//         if(root == null) return false;
//         System.out.println(curSum + " " + root.val);
//         if(root.left == null && root.right == null && (curSum + root.val) == targetSum) return true;
        
//         return find(root.left, curSum + root.val, targetSum) || find(root.right, curSum + root.val, targetSum);
//     }
    
    public boolean find(TreeNode root, int targetSum) {
        if(root == null) return false;
        
        if(root.left == null && root.right == null && (targetSum - root.val) == 0) return true;
        
        boolean left = false;
        if(root.left != null) {
            left = find(root.left, targetSum - root.val);
        }
        boolean right = false;
        if(root.right != null) {
            right = find(root.right, targetSum - root.val);
        }
        
        return left == true? left : right;
    }
}
