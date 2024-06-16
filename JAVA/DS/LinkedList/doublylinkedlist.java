package LinkedList;
public class doublylinkedlist {
    public class Node {
        Node prev;
        int val;
        Node next;
    }
    Node head;

    void insertFirst(int data) {
        Node newnode = new Node();
        newnode.val = data;
        if (head == null) {
            newnode.prev = null;
            newnode.next = head;
            head = newnode;
            return;
        }
        newnode.prev = null;
        newnode.next = head;
        head = newnode;
        return;        
    }

    void insertLast(int data) {
        Node newNode = new Node();
        newNode.val = data;
        if (head == null) {
            insertFirst(data);
            return;
        }
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
        newNode.prev = ptr;
        newNode.next = null;
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("Sorry no one is present");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node ptr = head.next;
        ptr.prev = null;
        head = ptr;
    }
    void deleteLast() {
        if (head == null) {
            System.out.println("Sorry no one is present");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next.prev = null;
        ptr.next = null;
    }

    void traverse() {
        if (head == null) {
            System.out.println("Sorry no one is present...");
            return;
        }
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + "->");
            ptr = ptr.next;
        }
        System.out.println();
    }
}
