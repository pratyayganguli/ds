package org.example.trash;


import java.util.List;
import java.util.Arrays;

/**
 * 
 * * From an array of integers to a list of integers
 * * @author Pratyay
 */

class Conversion {

    public static void main(String[] args) {
        List<Integer> value = convertFromArrInt(new int[]{
            4, 5, 3, 2
        });
        //int[] intArr = convertFromList();
        System.out.println(value);
       //System.out.println(intArr.toString());
    }

    private static List<Integer> convertFromArrInt(int [] arr) {
        var value = Arrays.asList(
            Arrays.stream(arr).boxed().toArray(Integer[]::new)
        );
        return value;
    }

    private static int[] convertFromList(List<Integer> collection) {
        return collection.stream().mapToInt(Integer::intValue).toArray();
    }

}
