package HomeWork3;

import java.util.EmptyStackException;

public class MyDeque<Item> extends MyQueue{
    private Item[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    private int begin = 0;
    private int end = 0;

    public MyDeque(int capacity) {
        if (capacity <= 0){
            throw new IllegalArgumentException("Bad Size ");
        }
        list = (Item[]) new Object[capacity];
    }
    public MyDeque() {
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }
    //add element in First (head) & Last(tail) Deque
    public void addFirst(Item item){

}
    public void addLast(Item item){

    }
    //remove element in First (head) & Last(tail) Deque
    public void removeFirst(Item item){

    }
    public void removeLast(Item item){

    }
    //peek element in First (head) & Last(tail)Deque
    public void peekFirst(Item item){

    }
    public void peekLast(Item item){

    }

}
