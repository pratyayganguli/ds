package org.example.neetcode.arrays_hashing;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * *
 * * @author Pratyay
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int arr[] = twoSum.solution(new int[]{2,5,5,11}, 10);
        System.out.println(Arrays.toString(arr));
    }
    public int[] solution(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            while(j < arr.length) {
                if((arr[i] + arr[j] == target) && (i != j)) {
                    list.addAll(List.of(i, j));
                    return list.stream().mapToInt(Integer::intValue).toArray();
                }
                j++;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
