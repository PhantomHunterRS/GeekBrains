package HomeWork3;

// Stack
public class HomeWork3 {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<Integer>();
//        stack.push(2);
//        stack.push(32);
//        stack.push(5);
//        stack.push(7);
//
//        for (int i = 0; i < 8 ; i++) {
//            System.out.println(stack.pop());
//        }

//       Expression expression = new Expression("(2+3} - [2+0] - {4-5}");
//        System.out.println(expression.checkBracket());
//    MyQueue<Integer> queue =new MyQueue<Integer>(7);
//        for (int i = 0; i < 7 ; i++) {
//            queue.insert(i);
//        }
//        for (int i = 0; i <7 ; i++) {
//            System.out.println(queue.remove());
//        }

        MyPriorityQueue<Integer> myPriorityQueue = new MyPriorityQueue<Integer>();
        myPriorityQueue.insert(5);
        System.out.println(myPriorityQueue);
        myPriorityQueue.insert(15);
        System.out.println(myPriorityQueue);
        myPriorityQueue.insert(1);
        System.out.println(myPriorityQueue);
        myPriorityQueue.remove();
        System.out.println(myPriorityQueue);
   }
}
