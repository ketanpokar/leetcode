// Problem Link : https://leetcode.com/problems/leaf-similar-trees/

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
class LeafSimilarTree {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> one = traverse(root1, new ArrayList<Integer>());
        List<Integer> two = traverse(root2, new ArrayList<Integer>());
        if(one.size() != two.size()) {
            return false;
        }
        for(int i = 0; i < one.size(); i++) {
            if(one.get(i) != two.get(i))
                return false;
        }
        return true;
    }
    
    public List<Integer> traverse(TreeNode root, List<Integer> leafVals) {
        if(root == null)
            return null;
        if(root.left == null && root.right == null) {
            leafVals.add(root.val);
        }
        traverse(root.left, leafVals);
        traverse(root.right, leafVals);
        return leafVals;
    }
    
}
