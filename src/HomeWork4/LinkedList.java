package HomeWork4;

public class LinkedList<TYPE> {
    private Link<TYPE> first;

    public LinkedList() {
        this.first = null;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insert(TYPE link){
        Link<TYPE> linkType = new Link<>(link);
        linkType.setNext(first);
        this.first = linkType;
    }
    public Link<TYPE> delete(){
        Link<TYPE> temp = first;
        first = first.getNext();
        return temp;
    }
    public void display(){
        Link<TYPE> current = first;
        while(current != first){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    public TYPE find(TYPE searchNode){
        Link<TYPE> findNode = new Link<TYPE>(searchNode);
        Link<TYPE> current = first;
        while (current != null){
            if (current.getValue().equals(findNode.getValue())){
                return findNode.getValue();
            }
            current = current.getNext();
        }
        return null;
    }
}
