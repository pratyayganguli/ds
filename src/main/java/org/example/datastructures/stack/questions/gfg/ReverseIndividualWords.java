
package org.example.datastructures.stack.questions.gfg;


import org.example.datastructures.stack.Stack;

import java.util.ArrayList;
import java.util.List;

// Hi Jane
// iH enaJ

class ReverseIndividualWords {

    /**
     *
     * @param input
     * @return
     */
    private static String reverseIndividualWords(String input) {
        List<Character> reversed = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        char [] inputCharArray = input.toCharArray();
        int wordCount = 0;

        for (int i = 0; i <= inputCharArray.length ; i++) {
            if(i == inputCharArray.length) {
                for (int j = 0; j < wordCount; j++) {
                    reversed.add(stack.pop());
                }
                break;
            }

            if(inputCharArray[i] == ' '){
                for (int j = 0; j < wordCount; j++) {
                    reversed.add(stack.pop());
                }
                reversed.add(' ');
                wordCount = 0;
            } else {
                stack.push(inputCharArray[i]);
                wordCount++;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        reversed.forEach(character -> stringBuilder.append(character));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String reversedString = reverseIndividualWords("Hi Jane");
        System.out.println(reversedString);
    }
}