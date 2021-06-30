// Problem Link : https://leetcode.com/problems/construct-string-from-binary-tree/

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
class ConstructStringFromBinaryTree {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        create(root, sb);
        return sb.toString();
    }
    

    public void create(TreeNode root, StringBuilder string) {
        string.append(root.val);
        if(root.right == null && root.left == null) return;
        if(root.left != null && root.right != null) {
            string.append("(").append(tree2str(root.left)).append(")(").append(tree2str(root.right)).append(")");
        } else if(root.left != null) {
            string.append("(").append(tree2str(root.left)).append(")");
        } else if(root.right != null) {
            string.append("()(").append(tree2str(root.right)).append(")");
        }
        
    }
}
