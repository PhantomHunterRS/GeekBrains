package HomeWork3;

// Stack
public class HomeWork3 {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(2);
        stack.push(32);
        stack.push(5);
        stack.push(7);
        stack.push(-2);
        stack.push(-3);
        stack.push(-0);

        for (int i = 0; i < 8 ; i++) {
            System.out.println(stack.pop());
        }

    }
}
