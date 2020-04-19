package HomeWork4;

import java.util.HashMap;
import java.util.Map;

public class HomeWork4 {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.insertFirst("Alex2");
        myLinkedList.insertFirst("Alex6");
        myLinkedList.insertFirst("Alex8");
        System.out.println(myLinkedList);
        myLinkedList.removeLast();
        System.out.println(myLinkedList);
        myLinkedList.removeFirst();
        System.out.println(myLinkedList);

    }
}
