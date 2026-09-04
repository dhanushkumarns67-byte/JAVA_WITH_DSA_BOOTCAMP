package DAY9.SESSION2;

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList2 {
    static Node2 head;

    static void insertAtBeginning(int data) {
        Node2 newNode = new Node2(data);
        newNode.next = head;
        head = newNode;
    }

    static void reverseList() {
        Node2 prev = null;
        Node2 current = head;
        Node2 nextNode;

        while (current != null) {
            nextNode = current.next;   // store next node
            current.next = prev;       // reverse link
            prev = current;            // move prev forward
            current = nextNode;        // move current forward
        }

        head = prev; // new head of reversed list
    }

    static void display() {
        Node2 current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertAtBeginning(10);
        insertAtBeginning(20);
        insertAtBeginning(30);
        insertAtBeginning(40);
        insertAtBeginning(50);

        System.out.println("Original Linked List:");
        display();

        reverseList();

        System.out.println("Reversed Linked List:");
        display();
    }
}