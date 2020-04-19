package HomeWork3;

public class Expression {
    private String exp;

    public Expression(String exp) {
        this.exp = exp;
    }
    public boolean checkBracket(){
    MyStack<Character> characterMyStack = new MyStack<Character>(exp.length());
        for (int i = 0; i <exp.length() ; i++) {
            char ch = exp.charAt(i);
            if (ch =='(' || ch == '[' || ch == '{'){
                characterMyStack.push(ch);
            }else if (ch ==')' || ch == ']' || ch == '}'){
                if (characterMyStack.isEmpty()){
                    System.out.println("Error in " + i + " position");
                    return false;
                }
                char top = characterMyStack.pop();
                if (ch == ')' && top !='(' ||
                    ch == ']' && top !='[' ||
                    ch == '}' && top !='{'){
                    System.out.println("Error in " + i + " position");
                    return false;
                }
            }
        }
        if (!characterMyStack.isEmpty()){
            System.out.println("Error");
            return false;
        }
        return true;
    }
}
