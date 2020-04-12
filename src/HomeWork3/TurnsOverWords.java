package HomeWork3;

public class TurnsOverWords {
    private char [] ch;

    public TurnsOverWords(String word) {
        ch = new char[word.length()];
        ch = word.toCharArray();
    }
    public String turnsOverWords(){
        MyStack<Character> myStack = new MyStack(ch.length);
        StringBuilder stringBuilder = new StringBuilder(myStack.size());
        for (int i = 0; i <ch.length ; i++) {
            myStack.push(ch[i]);
        }
        for (int i = 0; i <myStack.size(); i++) {
            stringBuilder.append(myStack.pop());
        }
        return stringBuilder.toString();
    }
}
