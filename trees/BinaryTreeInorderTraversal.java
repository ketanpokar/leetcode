// Problem Link : https://leetcode.com/problems/binary-tree-inorder-traversal/

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
class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root == null)
            return new ArrayList<>();
        
        List<Integer> values = new ArrayList<>();

        values.addAll(inorderTraversal(root.left));
        values.add(root.val);
        values.addAll(inorderTraversal(root.right));
        return values;
        
    }
}
