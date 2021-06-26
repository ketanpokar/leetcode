// Problem Link : https://leetcode.com/problems/binary-tree-paths/

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
class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        find(root, "");
        return result;
    }
    List<String> result = new ArrayList<>();
    public void find(TreeNode root, String path) {
        if(root == null) return;
        if(root != null && root.left == null && root.right == null) {
            result.add(path + root.val);
            return;
        }
        
        if(root.left != null) find(root.left, path + root.val + "->");
        if(root.right != null) find(root.right, path + root.val + "->");
    }
}
