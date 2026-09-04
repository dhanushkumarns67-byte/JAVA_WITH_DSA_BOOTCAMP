package DAY11.SESSION2;
class Node{
    int data;
    Node left,right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Leetcode100 {
    private boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.data != q.data) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        Leetcode100 tree = new Leetcode100();
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);

        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(3);

        System.out.println("Are the two trees the same? " + tree.isSameTree(p, q));
    }
}
