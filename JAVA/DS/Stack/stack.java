package Stack;

public class stack {
    int arr[];
    int top = -1, size = 1000;

    public stack() {
        arr = new int[size];
    }

    public stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public int getTop() {
        return top;
    }
    public void push(int val) {
        if (top == size - 1) {
            System.out.println("Nahi Jagah Hai");
            return;
        }
        top++;
        arr[top] = val;
    }
    public int pop() {
        int temp = arr[top];
        top--;
        return temp;
    }
    public void traverse() {
        int tp = -1;
        while (tp != top) {
            tp++;
            System.out.println(arr[tp]);
        }
    }
}
