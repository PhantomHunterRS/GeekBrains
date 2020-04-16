package HomeWork4;

public class Link<TYPE> {
    private TYPE link;
    private Link<TYPE> next;

    public Link(TYPE link) {
        this.link = link;
    }
    public Link<TYPE> getNext() {
        return next;
    }
    public void setNext(Link<TYPE> next) {
        this.next = next;
    }
    public TYPE getValue(){
        return link;
    }
}
