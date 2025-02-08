package org.example.gfg;


import java.util.Arrays;
import java.util.HashSet;

/**
 * *
 * * @author Pratyay
 */
class SortArrays0s1s2s {
    public static void main(String[] args) {
        int[] arr = sort(new int[]{0, 1, 2, 0, 1, 2});
        System.out.println(Arrays.toString(arr));
    }

    // this is not a proper solution
    private static int[] sort(int[] arr) {
        int countOs = 0;
        int count1s = 0;
        int count2s = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                countOs++;
            } else if(arr[i] == 1){
                count1s++;
            } else{
                count2s++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(countOs-- > 0) arr[i] = 0;
            else if(count1s-- > 1) arr[i] = 1;
            else arr[i] = 2;
        }

        return arr;
    }
}
