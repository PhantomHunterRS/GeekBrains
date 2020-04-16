package HomeWork3;

public class TurnsOverWords {
    private char [] ch;

    public TurnsOverWords(String word) {
        ch = new char[word.length()];
        ch = word.toCharArray();
    }
    public String turnsOverWords(){
        MyStack<Character> myStack = new MyStack(ch.length);
        for (int i = 0; i <ch.length ; i++) {
            myStack.push(ch[i]);
        }
        String tOWord = "";
        for (int i = 0; i < ch.length; i++) {
            tOWord += myStack.pop();
        }
        return tOWord;
    }
}
