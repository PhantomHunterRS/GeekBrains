package HomeWork4;

public class MyLinkedList<Item> {

    private Node first;
    private Node last;
    private int size = 0;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }
    public int size(){
        return size;
    }
    public Item getFirst(){
        if(isEmpty()){
            return null;
        }
        return (Item) first.value;
    }
    public Item getLast(){
        if(isEmpty()){
            return null;
        }
        return (Item) last.value;
    }
    public void insertFirst(Item item){
        Node newNode = new Node (item);
        newNode.setNext(first);
        if(isEmpty()){
          last = newNode;
        }else{
            first.setPrevious(newNode);
        }
        first = newNode;
        size++;
    }
    public void insertLast(Item item){
        Node newNode = new Node (item);
        newNode.setNext(first);
        if(isEmpty()){
            last = newNode;
        }else{
            newNode.setPrevious(last);
        }
        last = newNode;
        size++;
    }
    public Item removeFirst(){
        if (isEmpty()){
            return null;
        }
        Node oldFirst = first;
        first = first.next;
        size--;
        if (isEmpty()){
            last = null;
        }else {
            first.setPrevious(null);
        }
        return (Item) oldFirst.getValue();
    }
    public Item removeLast(){
        if (isEmpty()){
            return null;
        }
        Node oldLast = first;
        first = first.next;
        size--;
        if (isEmpty()){
            last = null;
        }else {
            first.setPrevious(null);
        }
        return (Item) oldLast.getValue();
    }

    

    class Node<Item>{
        private Item value;
        private Node next;
        private Node previous;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }

        public Node(Item value) {
            this.value = value;
        }

        public Node(Item value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Item getValue() {
            return value;
        }

        public void setValue(Item value) {
            this.value = value;
        }
    }
}

