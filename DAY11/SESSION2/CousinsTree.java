package DAY11.SESSION2;

import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class CousinsTree {
    public boolean CheckCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            boolean Xcheck = false;
            boolean Ycheck = false;
            for(int i = 0; i < n; i++){
                TreeNode node = queue.poll();
                if (node.left != null && node.right != null) {
                    int left = node.left.data;
                    int right = node.right.data;
                    if ((left == x && right == y) || (left == y && right == x)) {
                        return false;
                    }
                }
                if(node.data == x){
                    Xcheck = true;
                }
                if(node.data == y){
                    Ycheck = true;
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            if(Xcheck && Ycheck) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CousinsTree ct = new CousinsTree();
        
        // Test Case 1: Cousins in a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        System.out.println("Test 1 - Are 4 and 6 cousins? " + ct.CheckCousins(root, 4, 6)); // true
        System.out.println("Test 2 - Are 4 and 5 cousins? " + ct.CheckCousins(root, 4, 5)); // false (siblings)
        System.out.println("Test 3 - Are 2 and 3 cousins? " + ct.CheckCousins(root, 2, 3)); // false (siblings)
        System.out.println("Test 4 - Are 5 and 6 cousins? " + ct.CheckCousins(root, 5, 6)); // true
    }
}
