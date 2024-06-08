package Stack;

public class stackImplementationUsingArrays {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(9);
        s.push(8);
        System.out.println("Popped element is " + s.pop());
        s.push(7);
        s.traverse();
    }
}
