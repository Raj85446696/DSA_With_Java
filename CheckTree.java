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
    // Check if two trees are identical
    public boolean isSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }

    // Insert node into BST
    public TreeNode insertNode(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.val) {
            root.left = insertNode(root.left, data);
        } else {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    // Preorder traversal (Root -> Left -> Right)
    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");  // Print before recursion
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        Solution tree = new Solution();

        // Create the first tree
        TreeNode root = null;
        root = tree.insertNode(root, 5);
        root = tree.insertNode(root, 3);
        root = tree.insertNode(root, 7);
        root = tree.insertNode(root, 2);
        root = tree.insertNode(root, 4);
        root = tree.insertNode(root, 6);
        root = tree.insertNode(root, 8);

        System.out.print("Preorder Traversal: ");
        tree.preorder(root);

        // Create another tree for comparison
        TreeNode anotherRoot = new TreeNode(5);
        anotherRoot.left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        anotherRoot.right = new TreeNode(7, new TreeNode(6), new TreeNode(8));

        // Check if both trees are identical
        System.out.println("\nTrees are identical: " + tree.isSame(root, anotherRoot));
    }
}
