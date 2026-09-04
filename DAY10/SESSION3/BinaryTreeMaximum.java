package DAY10.SESSION3;

public class BinaryTreeMaximum {

    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int findMax(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Maximum value in the binary tree: " + findMax(root));
    }
    
}
