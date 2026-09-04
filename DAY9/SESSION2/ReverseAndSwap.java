package DAY9.SESSION2;
public class ReverseAndSwap {
    static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
//Reverse
public static Node reverse(Node head){
    Node prev=null;
    Node curr=head;
    while(curr!=null){
        Node next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
    return head;
}
//swap
static void swap(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node first = head;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        int temp = first.data;        first.data = last.data;
        last.data = temp;
    }

    static Node head;
    static void insertAtBeigining(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        insertAtBeigining(101);
        insertAtBeigining(102);
        insertAtBeigining(105);
        insertAtBeigining(106);
        insertAtBeigining(107);
        print();
        head=reverse(head);
        print();
        swap(head);
        print();
    }
}