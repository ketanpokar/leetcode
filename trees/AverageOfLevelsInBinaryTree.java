// Problem Link : https://leetcode.com/problems/average-of-levels-in-binary-tree/

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
class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {

        List<List<Long>> levelElements = new ArrayList<>();
        findAverages(root, 0, levelElements);
        List<Double> result = new ArrayList<>(1);
        if(levelElements.size() > 0) {
            for(List<Long> level : levelElements) {
                double sum = (double)level.stream().reduce(0l, Long::sum);
                result.add(sum/level.size());
            }
        }
        return result;
    }
    
    public void findAverages(TreeNode root, int height, List<List<Long>> elements) {
        if(root == null) return;
        
        if(elements.size() <= height) {
            elements.add(new ArrayList<>());
        }
        elements.get(height).add((long)root.val);
        if(root.left != null) {
            findAverages(root.left, height + 1, elements);
        }
        if(root.right != null) {
            findAverages(root.right, height + 1, elements);
        }
        
    }
    
    
}
