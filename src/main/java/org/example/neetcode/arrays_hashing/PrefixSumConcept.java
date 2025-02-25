package org.example.neetcode.arrays_hashing;


import java.util.Arrays;

/**
 * *
 * the logic for prefix sum is simple.
 * initialize the prefix array index 0 to the first value and then iterate over the array
 *
 * p[i] = p[i-1] + arr[i]
 * the same logic can be used when you want to multiply numbers.
 *
 * * @author Pratyay
 */

class PrefixSumConcept {

    public static void main(String[] args) {
        int arr[] = new int[] {1, 5, 8, 10};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        System.out.println(Arrays.toString(prefix));
    }
}
