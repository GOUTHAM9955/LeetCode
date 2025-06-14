package dsa.practise.stack;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValidParanthesis(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char ch: s.toCharArray()){
            if(ch == '(') stack.push(')');
            else if(ch =='{') stack.push('}');
            else if (ch=='[') stack.push(']');
            else{
                if (stack.isEmpty() || stack.pop()!=ch ) return false;
            }
        }
        return stack.isEmpty();
    }
}
