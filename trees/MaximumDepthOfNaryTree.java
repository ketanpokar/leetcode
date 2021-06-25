// Problem Link : https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class MaximumDepthOfNaryTree {
    public int maxDepth(Node root) {
        if(root == null)
            return 0;
        return height(root, 1);
    }
    
    
    public int height(Node root, int height) {
        
        if(root == null) {
            return height;
        }
        
        int max = height;
        for(Node node: root.children) {
            max = Math.max(max, height(node, height + 1));
        }
        return max;
    }
}
