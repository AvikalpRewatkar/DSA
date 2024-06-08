package Queue;

public class queueImplementationUsingArrays {
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(9);
        q.enqueue(8);
        System.out.println("Dequeued element is " + q.dequeue());
        q.enqueue(7);
        q.enqueue(8);
        q.traverse();
    }
}