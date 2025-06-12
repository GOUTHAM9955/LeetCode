package dsa.practise.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {
    private Deque<Integer> stack = new ArrayDeque<>();

    private Deque<Integer> minValueStack = new ArrayDeque<>();
    public MinStack() {
        minValueStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        minValueStack.push(Math.min(val,minValueStack.peek()));
    }

    public void pop() {
        stack.pop();
        minValueStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minValueStack.peek();
    }
}
