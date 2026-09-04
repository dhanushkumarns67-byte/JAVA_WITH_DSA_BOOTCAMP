package DAY11.SESSION1;

import java.util.LinkedList;
import java.util.Queue;
class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Level_Order {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Level order traversal of binary tree is:");
        System.out.print(levelOrder(root));
    }
    
    private static String levelOrder(Node root) {
        if (root == null) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.append(current.data).append(" ");
            
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        
        return result.toString();
    }
}