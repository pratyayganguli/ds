package org.example.trash;


import java.util.ArrayList;
import java.util.List;

/**
 * *
 * * @author Pratyay
 */
class ArrayListSwap {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1);
        arrayList.add(-2);
        arrayList.add(-3);
        swap(arrayList);
    }

    private static void swap(List<Integer> numbers) {
        int fixed = 1;
        for (int i = 0; i < numbers.size() ; i++) {
            if(numbers.get(i) < 0) {
                numbers.set(i, Integer.valueOf(fixed));
            }
        }
        System.out.println(numbers);
    }
}
