package Stack;

import Queue.queue;

public class StackUsingQueue {
    queue q1 = new queue();
    queue q2 = new queue();
    
    void push(int item) {
        q1.enqueue(item);
    }
    int pop() {
        while (q1.getFront() != q1.getRear()) {
            q2.enqueue(q1.dequeue());
        }
        int data = q1.dequeue();
        while (q2.getFront() != q2.getRear()) {
            q1.enqueue(q2.dequeue());
        }
        q1.enqueue(q2.dequeue());

        return data;
    }
    int getTop() {
        return q1.getElement(q1.getRear());
    }
    void traverse() {
        int ptr = q1.getFront();
        while (ptr != q1.getRear()) {
            System.out.print(q1.getElement(ptr) + " ");
            ptr++;
        }
        System.out.println(q1.getElement(ptr));
    }
}
