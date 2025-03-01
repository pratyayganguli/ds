package org.example.neetcode.stack_questions;


import java.util.Stack;

/**
 * *
 * * @author Pratyay
 */
class ReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = new String[] {
                "1", "2", "+"
        };
        int res = evalRPN(tokens);
        System.out.println(res);
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens) {
            if(isOperator(token)) {
                int num2 = stack.peek();
                stack.pop();
                int num1 = stack.peek();
                stack.pop();
                int res = compute(num1, num2, token);
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String token) {
        if("+-/*".contains(token)) {
            return true;
        }
        return false;
    }

    private static int compute(int num1, int num2, String token) {
        return switch(token) {
            case "+" -> num1 + num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "-" -> num1 - num2;
            default -> throw new IllegalStateException("unsupported operation");
        };
    }
}
