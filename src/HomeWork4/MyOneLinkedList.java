package HomeWork4;

public class MyOneLinkedList<Item> {
    private Node first;
    private int size = 0;

    public MyOneLinkedList(){
        first = null;
    }
    class Node<Item>{
        private Item value;
        private Node next;

        public Node (Item value){
            this.value = value;
        }
        public Item getValue(){
            return value;
        }
        public void setValue(Item value){
            this.value = value;
        }
        public Node getNext(){
            return next;
        }
        public void setNext(Node next){
            this.next = next;
        }
        @Override
        public String toString() {
            return value.toString();
        }
    }
}
