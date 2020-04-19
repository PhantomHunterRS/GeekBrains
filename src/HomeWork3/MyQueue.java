package HomeWork3;

import java.util.EmptyStackException;

public class MyQueue<Item> {
    private Item[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    private int begin = 0;
    private int end = 0;

    public MyQueue(int capacity) {
        if (capacity <= 0){
            throw new IllegalArgumentException("Bad Size ");
        }
        list = (Item[]) new Object[capacity];
    }
    public MyQueue() {
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }
    //add element
    public void insert(Item item){
        if (isFull()){
            throw new StackOverflowError("Stack is Full");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }
    private int nextIndex (int index){
        return (index+1)%list.length;
    }

    public Item remove(){
        Item value = peekFront();
        size--;
        list[begin]= null;
        begin = nextIndex(begin);
        return value;
    }
    private Item peekFront(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list[begin];
    }

    public boolean isFull(){
        return size == list.length;
    }
    // delete element
    public boolean isEmpty(){
        return size == 0;
    }
    //size
    public int size(){
        return size;
    }

}

