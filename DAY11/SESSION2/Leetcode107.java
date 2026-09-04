package DAY11.SESSION2;

import java.util.*;

class TreeNode107 {
    int data;
    TreeNode107 left,right;
    TreeNode107(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Leetcode107 {
    TreeNode107 root;
    
    public List<List<Integer>> levelOrder(){
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode107> queue = new LinkedList<>(); 
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode107 node = queue.poll();
                level.add(node.data);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(0, level);
        }

        return result;

    }
    public static void main(String[] args) {
        Leetcode107 tree = new Leetcode107();
        tree.root = new TreeNode107(3);
        tree.root.left = new TreeNode107(9);
        tree.root.right = new TreeNode107(20);
        tree.root.left.left = new TreeNode107(15);
        tree.root.left.right = new TreeNode107(7);

        System.out.println("Level order traversal of binary tree is:");
        System.out.print(tree.levelOrder());
    }
        
}
