package org.example.datastructures.stack.questions.leetcode;


import org.example.datastructures.stack.Stack;

/**
 * *
 * * @author Pratyay
 */


class ValidParenthesis {

    /**
     *
     * @param input
     * @return
     */
    private static boolean isValidParenthesis(String input) {
        char [] charArr = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < charArr.length ; i++) {
            if(charArr[i] == '(') {
                stack.push(')');
            } else if(charArr[i] == '{') {
                stack.push('}');
            } else if(charArr[i] == '[') {
                stack.push(']');
            }
            else {
                if(stack.peek() != null) {
                    if (stack.peek().equals(charArr[i])) {
                        stack.pop();
                    } else if(charArr[i] == ']' || charArr[i] == ')' || charArr[i] == '}') {
                        stack.push(charArr[i]);
                    }
                } else if(charArr[i] == ']' || charArr[i] == ')' || charArr[i] == '}') {
                    stack.push(charArr[i]);
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValidParenthesis("(])"));
    }
}
