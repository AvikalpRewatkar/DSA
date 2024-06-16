package LinkedList;
// no use because it will be stuck in loop

public class circularSinglyLinkedList {
    public class Node {
        int val;
        Node next;
    }

    Node head;

    void insertFirst(int data) {
        Node newnode = new Node();
        newnode.val = data;
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    void traverse() {
        if (head == null) {
            return;
        }
        Node ptr = head;
        while (ptr.next != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
}
