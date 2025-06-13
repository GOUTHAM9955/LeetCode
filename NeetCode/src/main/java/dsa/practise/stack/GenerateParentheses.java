package dsa.practise.stack;

import java.util.*;

public class GenerateParentheses {
    List<String> parenthesis  = new ArrayList<>();
    String current;
    int open = 0;
    int close = 0;
    int max =0;
    public List<String> parenthesesGenerater(int n){
        max = n;
        backtrackingAlgorithm(parenthesis,"",open,close,max);
        return parenthesis;
        }

    public void backtrackingAlgorithm(List<String> result, String current, int open, int close, int n){
        if(current.length()==max*2) {
            result.add(current);
            return;
        }
        if (open<max) {
            backtrackingAlgorithm(result,current+"(",open+1,close,max );
        }
        if(close<open){
            backtrackingAlgorithm(result, current+")",open, close+1, max);
        }

    }

    public static void main(String args[]){
        GenerateParentheses obj1 = new GenerateParentheses();
        System.out.println(obj1.parenthesesGenerater(5));
    }

}
