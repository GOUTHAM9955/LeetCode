package dsa.practise.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotation{
    public int solution(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> operator = Arrays.asList("+","-","*","/");
        for(String str: tokens ){
            if (! operator.contains(str)){
                stack.push(Integer.parseInt(str));
            }
            else{
                int temp = 0;
                int b = stack.pop();
                int a = stack.pop();
                switch(str){
                    case "*": temp = a*b ; break;
                    case "+": temp = a+b; break;
                    case "-": temp = a-b; break;
                    case "/": temp = a/b; break;
                }
                stack.push(temp);
            }

        }
        return stack.pop();

    }
}
