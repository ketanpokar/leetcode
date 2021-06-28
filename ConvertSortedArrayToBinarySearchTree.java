// Problem Link : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

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
class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = (0 + nums.length) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        createTree(nums, 0, mid - 1, node, "l");
        createTree(nums, mid + 1, nums.length - 1, node, "r");
        return node;
    }

    public void createTree(int[] nums, int i, int j, TreeNode node, String dir) {
        if(i > j) return;
        int mid = (i + j) / 2;
        if(dir.equals("l")) {
            node.left = new TreeNode(nums[mid]);
            createTree(nums, i, mid - 1, node.left, "l");
            createTree(nums, mid + 1, j, node.left, "r");
        } else if(dir.equals("r")) {
            node.right = new TreeNode(nums[mid]);
            createTree(nums, i, mid - 1, node.right, "l");
            createTree(nums, mid + 1, j, node.right, "r");
        }
    }
}
