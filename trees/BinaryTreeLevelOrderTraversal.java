// Problem Link : https://leetcode.com/problems/binary-tree-level-order-traversal/

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
class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>(0);
        
        List<List<Integer>> result = new ArrayList<>(5);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> levelValues = new ArrayList<>(2);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if(node != null) {
                levelValues.add(node.val);
                if(node.left != null) 
                    q.add(node.left);
                if(node.right != null) 
                    q.add(node.right);
            } else {
                result.add(new ArrayList<>(levelValues));
                if(q.isEmpty()) break;
                q.add(null);
                levelValues.clear();
            }
        }
        return result;
    }

}
