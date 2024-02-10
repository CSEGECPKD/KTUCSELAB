/*
Write a Java Program That Implements Doubly Linked List.
*/
class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insertion at the front
    public void insertFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insertion at the rear
    public void insertRear(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Deletion at the front
    public void deleteFront() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    // Deletion at the rear
    public void deleteRear() {
        if (tail == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    // Insertion at a specific position
    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position.");
            return;
        }

        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            Node current = head;
            int count = 1;
            while (count < position - 1 && current != null) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Invalid position.");
                return;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
        }
    }

    // Deletion at a specific position
    public void deleteAtPosition(int position) {
        if (position < 1 || head == null) {
            System.out.println("Invalid position or list is empty.");
            return;
        }

        if (position == 1) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else {
            Node current = head;
            int count = 1;
            while (count < position && current != null) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Invalid position.");
                return;
            }
            if (current == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }

    // Display the doubly linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertFront(3);
        dll.insertFront(2);
        dll.insertFront(1);
        dll.display(); // Output: 1 2 3

        dll.insertRear(4);
        dll.insertRear(5);
        dll.display(); // Output: 1 2 3 4 5

        dll.deleteFront();
        dll.display(); // Output: 2 3 4 5

        dll.deleteRear();
        dll.display(); // Output: 2 3 4

        dll.insertAtPosition(6, 2);
        dll.display(); // Output: 2 6 3 4

        dll.deleteAtPosition(3);
        dll.display(); // Output: 2 6 4
    }
}