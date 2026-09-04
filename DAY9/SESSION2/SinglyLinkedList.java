package DAY9.SESSION2;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class SinglyLinkedList {
    static Node head;

    static void insertAtBegining(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    static void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertAtBegining(10);
        insertAtBegining(20);
        insertAtBegining(30);
        insertAtBegining(40);
        insertAtBegining(50);
        
        System.out.println("Linked List:");
        display();
    }
}