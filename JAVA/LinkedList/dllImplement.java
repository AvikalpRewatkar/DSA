package LinkedList;

public class dllImplement {
    public static void main(String[] args) {
        doublylinkedlist dll = new doublylinkedlist();
        dll.insertFirst(10);dll.traverse();
        dll.insertFirst(9);dll.traverse();
        dll.insertFirst(8);dll.traverse();
        dll.insertFirst(7);dll.traverse();
        dll.insertLast(11);dll.traverse();
        dll.deleteFirst();dll.traverse();
        dll.deleteLast();dll.traverse();
        dll.deleteLast();dll.traverse();
        dll.deleteFirst();dll.traverse();
        dll.deleteFirst();dll.traverse();
    }
}
