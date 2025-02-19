package org.example.trash;


import java.util.*;

/**
 * *
 * * @author Pratyay
 */
class ArrayAssignment {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        String message = "hello";
        StringBuilder stringBuilder = new StringBuilder(message);
        stringBuilder.reverse();

        char ch = ':';
        if(Character.isAlphabetic((int)ch)) {
            System.out.println("the character is alphabetic");
        }

        int [] arr = new int[]{2, 4, 5};
        int [] copyArr = new int[arr.length + 1];

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        copyArr = arr;
        Arrays.toString(copyArr);

        copyArr = nums.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(copyArr));
    }
}
