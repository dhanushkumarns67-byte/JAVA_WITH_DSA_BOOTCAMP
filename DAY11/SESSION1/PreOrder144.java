package DAY11.SESSION1;

import java.util.*;

class TreeNode144 {
    int val;
    TreeNode144 left;
    TreeNode144 right;
    TreeNode144(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class PreOrder144 {
    List<Integer> getPreorder(TreeNode144 root) {
        List<Integer> result = new ArrayList<>();
        getPreorder(root, result);
        return result;
    }
    private void getPreorder(TreeNode144 root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        getPreorder(root.left, result);
        getPreorder(root.right, result);
    }
public static void main(String[] args) {

    PreOrder144 preorder = new PreOrder144();
    TreeNode144 root = new TreeNode144(1);
    root.left = new TreeNode144(2);
    root.right = new TreeNode144(3);
    root.left.left = new TreeNode144(4);
    root.left.right = new TreeNode144(5);

    List<Integer> result = preorder.getPreorder(root);
    System.out.println("Preorder traversal: " + result);
}
}
