package HomeWork4;

public class MyLinkStack<TYPE> {
    private MyLinkedList<TYPE> stack = new MyLinkedList<TYPE>();

    public void push(TYPE value){
        stack.insertFirst(value);
    }
    public TYPE pop(){
        return stack.removeFirst();
    }
    public TYPE peek(){
        return stack.getFirst();
    }
    public int size (){
        return stack.size();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
