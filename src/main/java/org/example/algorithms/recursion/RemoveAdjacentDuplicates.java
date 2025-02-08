package org.example.algorithms.recursion;


import java.util.TreeSet;

/**
 * *
 * * @author Pratyay
 */

class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String val = removeAdjacentDuplicates("abaa", 0, new StringBuilder());
        System.out.println(val);
    }

    private static String removeAdjacentDuplicates(String val, int index, StringBuilder stringBuilder) {
       if(index < val.length()){
           if((index == val.length()-1) && (val.charAt(index) == val.charAt(index -1))) {
               index++;
               return removeAdjacentDuplicates(val, index, stringBuilder);
           }

           if((val.charAt(index) != val.charAt(index +1)) && (index < (val.length() - 2))){
               stringBuilder.append(val.charAt(index));
           }
           index++;
           return removeAdjacentDuplicates(val, index, stringBuilder);
       }
       return stringBuilder.toString();
    }
}

