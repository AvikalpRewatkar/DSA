package LinkedList;

public class sllImplement {
    public static void main(String[] args) {
        singlylinkedlist ll = new singlylinkedlist();
        ll.addFirst(5);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.addFirst(4);
        
        ll.addLast(0);
        ll.addLast(1);
        ll.addLast(3);
        ll.addFirst(6);
        ll.addMid(10, 3);
        ll.traverse();
        ll.delFirst();
        ll.delLast();
        ll.traverse();
        ll.delMid(0);
        ll.traverse();
        ll.sizeofLL();
        ll.ls(10);
        ll.reverse();
        ll.traverse();

    }
}
