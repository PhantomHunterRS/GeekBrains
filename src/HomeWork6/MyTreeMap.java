package HomeWork6;

import sun.invoke.empty.Empty;

public class MyTreeMap<Key extends Comparable<Key>,Value> {
    Node root;

    private class Node{
        Key key;
        Value value;
        Node left;
        Node right;

        int size;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            size = 1;
        }
    }

    public int size(){
        return size(root);
    }
    private int size (Node node){
        if (node == null){
            return 0;
        }
        return node.size;
    }
    public boolean isEmpty(){
        return root == null;
    }
    private boolean isKeyNotNull(Key key){
        if (key == null){
            throw new IllegalArgumentException("Key is not NULL");
        }
        return true;
    }
    public Value get(Key key){
        return get (root,key);
    }
    public boolean contains(Key key){
        return get (root,key)!= null;
    }
    //dopisat
    @Override
    public String toString(){
        return toString(root);
    }
    private String toString (Node node){
        if (node == null){
            return "";
        }
        return toString(node.left) + " " + node.key.toString() + " = " + node.value.toString() + " ";// dopisat'

    }

    private Value get(Node node, Key key){
        isKeyNotNull(key);
        if (node == null){
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp ==0){
            return node.value;
        }else if (cmp < 0){
            return get(node.left,key);
        }else {
            return get(node.right,key);
        }
    }
}
