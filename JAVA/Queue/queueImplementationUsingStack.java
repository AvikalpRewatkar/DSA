package Queue;

import Stack.stack;

public class queueImplementationUsingStack {
    public static void main(String[] args) {
        queueStack q = new queueStack();
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("Dequeued element is " + q.dequeue());
        System.out.println("Dequeued element is " + q.dequeue());
        q.enqueue(5);
        q.enqueue(6);
        q.traverse();
    }
}
class queueStack {
    stack s1Stack = new stack();
    stack s2Stack = new stack();

    void enqueue(int val) {
        s1Stack.push(val);
    }
    int dequeue() {
        while (s1Stack.getTop() > 0) {
            s2Stack.push(s1Stack.pop());
        }
        int item = s1Stack.pop();
        while (s2Stack.getTop() >= 0) {
            s1Stack.push(s2Stack.pop());
        }
        return item;
    }
    void traverse() {
        s1Stack.traverse();
    }
}
