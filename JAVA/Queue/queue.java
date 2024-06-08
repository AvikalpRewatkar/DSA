package Queue;

public class queue {
    int size = 1000;
    int arr[] = new int[size];
    int front = -1;
    int rear = -1;

    public void enqueue(int val) {
        if (rear == size - 1) {
            System.out.println("Nhi jagah hai");
            return;
        }
        if (front == -1 && rear == -1) {
            front++;
            rear++;
            arr[rear] = val;        
        } else {
            rear++;
            arr[rear] = val;
            
        }
    }
    // Its better to use 'Integer' instead of 'int' to return null instead of -1 or any other value... 
    public Integer dequeue() {
        if (front == -1) {
            System.out.println("Bahut jagah hai");
            return null;
        }
        int item = arr[front];
        if (front == size - 1)
            front = -1;
        front++;
        return item;        
    }
    public void traverse() {
        if (front == -1 && rear == -1) {
            System.out.println("Koi nhi hai...");
            return;
        }
        int fp = front;
        System.out.println("Elements are:");
        while (fp != rear + 1) {
            System.out.print(arr[fp] + " ");
            fp++;
        }
        System.out.println();
    }
    public int getFront() {
        return front;
    }
    public int getRear() {
        return rear;
    }
    public int getElement(int index) {
        int data = arr[index];
        return data;
    }
}
