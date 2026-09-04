package DAY9.SESSION2;

class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList3 {
    static Node3 head;

    static void insertAtBeginning(int data) {
        Node3 newNode = new Node3(data);
        newNode.next = head;
        head = newNode;
    }

    static void swapPairs() {
        Node3 dummy = new Node3(0);
        dummy.next = head;
        Node3 prev = dummy;
        Node3 current = head;

        while (current != null && current.next != null) {
            Node3 first = current;
            Node3 second = current.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
            current = first.next;
        }

        head = dummy.next;
    }

    static void display() {
        Node3 current = head;
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

        swapPairs();

        System.out.println("After swapping pairs:");
        display();
    }
}
