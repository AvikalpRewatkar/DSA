package Stack;

public class stackImplementUsingQueue {

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);stack.traverse();
        stack.push(2);stack.traverse();
        stack.push(3);stack.traverse();
        stack.push(4);stack.traverse();
        System.out.println(stack.pop());
        stack.traverse();
        stack.push(5);
        System.out.println(stack.getTop());
        stack.traverse();
    }
}