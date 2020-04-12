package HomeWork3;

import java.util.EmptyStackException;

public class MyStack<Item> {
    private Item[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyStack(int capacity) {
        if (capacity <= 0){
            throw new IllegalArgumentException("Bad Size ");
        }
        list = (Item[]) new Object[capacity];
    }
    public MyStack() {
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }
    //add element
    public void push(Item item){
        if (isFull()){
            throw new StackOverflowError("Stack is Full");
        }
        list[size] = item;
        size++;
    }
    public boolean isFull(){
        return size == list.length;
    }
    // delete element
    public Item pop (){
        Item temp = peek();
        size --;
        list[size] = null;
        return temp;
    }
    public Item peek() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list[size - 1];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    // change size
    private  void reCapacity(int newCapacity){
        Item [] tempArr = (Item[]) new Object[newCapacity];
        System.arraycopy(list,0,tempArr,0,size);
        list = tempArr;
    }
}