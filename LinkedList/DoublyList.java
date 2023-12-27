class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyList {
    private Node head;

    public DoublyList() {
        this.head = null;
    }

    // Method to add a new node to the end of the doubly linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to print the doubly linked list in forward direction
    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to print the doubly linked list in reverse direction
    public void printReverse() {
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a new doubly linked list
        DoublyList doublyLinkedList = new DoublyList();

        // Append nodes to the doubly linked list
        doublyLinkedList.append(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(4);

        // Print the doubly linked list in forward direction
        System.out.println("Doubly Linked List (Forward):");
        doublyLinkedList.printForward();

        // Print the doubly linked list in reverse direction
        System.out.println("Doubly Linked List (Reverse):");
        doublyLinkedList.printReverse();
    }
}
