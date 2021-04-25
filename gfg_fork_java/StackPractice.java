package gfg_fork_java;

import java.util.Stack;

/**
 * StackPractice
 */
public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack.peek());
        System.out.println(stack.size());
        Stack<Integer> reverseStack = new Stack<>();
        while (!stack.isEmpty()) {
            int poppedElem = stack.pop();
            System.out.printf("%d ", poppedElem);
            reverseStack.push(poppedElem);
        }
        System.out.println();
        System.out.println(reverseStack.peek());
        while (!reverseStack.isEmpty()) {
            System.out.printf("%d ", reverseStack.pop());
        }
    }
}