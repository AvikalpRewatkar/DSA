package LinkedList;

public class singlylinkedlist {
    public class Node {
        int data;
        Node next;
    }
    int size = 0;

    public Node head;
    public Node tail;



// Insert...
    public void addFirst(int item) {
        Node newnode = new Node();
        newnode.data = item;
        size++;
        if (head == null) {
            newnode.next = null;
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }
    public void addLast(int item) {
        Node newnode = new Node();
        newnode.data = item;
        size++;
        if (head == null) {
            newnode.next = null;
            head = tail = newnode;
            size++;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }
    public void addMid(int item, int i) {
        Node newnode = new Node();
        newnode.data = item;
        size++;
        if (head == null) {
            newnode.next = null;
            head = tail = newnode;
            size++;
            return;
        }

        Node ptr = head;
        int count = 0;
        while(ptr.next != null && count != i-1) {
            ptr = ptr.next;
            count++;
        }

        newnode.next = ptr.next;
        ptr.next = newnode;
    }

// Delete...
    public void delFirst() {
        if (head == null)
            return;
        head = head.next;
        size--;
    }
    public void delLast() {
        if (head == null)
            return;
        Node ptr = head;
        while (ptr.next != tail) {
            ptr = ptr.next;
        }
        ptr.next = null;
        tail = ptr;
        size--;
    }
    public void delMid(int item) {
        if (head == null)
            return;
        
        int i = findItem(item);
        Node ptr = head;
        int count = 0;
        while (ptr != null && count != i-1) {
            ptr = ptr.next;
            count++;
        }
        Node ptr2 = ptr.next;
        ptr.next = ptr2.next;
        ptr2.next = null;
        size--;
    }

    public void traverse() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.print("null\n");
    }

    public void sizeofLL() {
        System.out.println("Size of LL is " + size);
    }

    public int findItem(int item) {
        // finding...
        Node ptr = head;
        boolean flag = false;
        int count = 0;
        while (ptr!=null) {
            if (ptr.data == item) {
                flag = true;
                break;
            } else {
                ptr = ptr.next;
                count++;
            }
        }
        if (flag)
            return count;
        else 
            return -1;
    }

    public void ls(int item) {
        int i = findItem(item);
        System.out.print("Linear Search of " + item + " : ");
        if (i == -1)
            System.out.println("Not Found");
        else
            System.out.println("Item " + item + " found at " + i);
    }

    public void reverse() {
        tail = head;
        Node ptr = head.next;
        Node next = null;
        head.next = null;
        while (ptr != null) {
            next = ptr.next;
            ptr.next = head;
            head = ptr;
            ptr = next;
        }
    }
}