import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(); 
        Inorder(root,result);
        return result;
    }

    public void Inorder(TreeNode root , List<Integer> result ){
        if(root!=null){
            Inorder(root.left,result);
            System.out.println(root.val+" ");
            Inorder(root.right,result);

        }
    }
    public static void main(String[] args) {
        TreeNode t = new TreeNode(5,null , new TreeNode(3,new TreeNode(5),null));

        Solution s = new Solution(); 
        List <Integer> inorder = s.inorderTraversal(t);
        System.out.println(inorder);


    }
}
