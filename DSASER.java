// Given the root of a binary tree, return its maximum depth.
// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        Solution s = new Solution(); 
        TreeNode t = new TreeNode(5,null , new TreeNode(3,new TreeNode(5),null)); 
        System.out.println("Max Depth of the tree is : "+s.maxDepth(t));
    }
}