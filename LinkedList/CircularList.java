class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularList {
    private Node head;

    public CircularList() {
        this.head = null;
    }

    // Method to add a new node to the end of the circular linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Circular link to itself
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    // Method to print the circular linked list
    public void printList() {
        if (head == null) {
            System.out.println("Empty Circular Linked List");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a new circular linked list
        CircularList circularLinkedList = new CircularList();

        // Append nodes to the circular linked list
        circularLinkedList.append(1);
        circularLinkedList.append(2);
        circularLinkedList.append(3);
        circularLinkedList.append(4);

        // Print the circular linked list
        System.out.println("Circular Linked List:");
        circularLinkedList.printList();
    }
}
