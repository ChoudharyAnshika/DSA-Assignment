import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q17_SingleLinkedList {
    Node head = null;

    void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertAtStart(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < pos - 2 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void deleteFromStart() {
        if (head != null) head = head.next;
    }

    void deleteFromEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    void deleteFromPosition(int pos) {
        if (pos == 1) {
            deleteFromStart();
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 2 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    void search(int data) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Element found at position: " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }
        System.out.println("Element not found!");
    }

    void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Q17_SingleLinkedList list = new Q17_SingleLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert at Start");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete from Start");
            System.out.println("5. Delete from End");
            System.out.println("6. Delete from Position");
            System.out.println("7. Search");
            System.out.println("8. Display");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    list.insertAtStart(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    list.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    System.out.print("Enter position: ");
                    list.insertAtPosition(data, sc.nextInt());
                    break;
                case 4:
                    list.deleteFromStart();
                    break;
                case 5:
                    list.deleteFromEnd();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    list.deleteFromPosition(sc.nextInt());
                    break;
                case 7:
                    System.out.print("Enter data to search: ");
                    list.search(sc.nextInt());
                    break;
                case 8:
                    list.display();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}