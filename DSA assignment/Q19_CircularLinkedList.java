class CNode {
    int data;
    CNode next;

    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q19_CircularLinkedList {
    CNode head = null;

    void insert(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        CNode temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    void display() {
        if (head == null) return;
        CNode temp = head;
        System.out.println("Circular Linked List:");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        Q19_CircularLinkedList list = new Q19_CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();
    }
}