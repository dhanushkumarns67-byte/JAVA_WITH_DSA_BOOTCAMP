package DAY11.SESSION2;

class TreeNode104{
    TreeNode104 left,right;
    TreeNode104(int data) {
        this.left = null;
        this.right = null;
    }
}
public class Leetcode104 {
    TreeNode104 root;
    
    private int maxDepth(TreeNode104 root) {
            if (root == null) {
                return 0;
            }
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        Leetcode104 tree = new Leetcode104();
        tree.root = new TreeNode104(3);
        tree.root.left = new TreeNode104(9);
        tree.root.right = new TreeNode104(20);
        tree.root.right.left = new TreeNode104(15);
        tree.root.right.right = new TreeNode104(7);

        System.out.println("Maximum depth of binary tree is: " + tree.maxDepth(tree.root));
    }
    
}
