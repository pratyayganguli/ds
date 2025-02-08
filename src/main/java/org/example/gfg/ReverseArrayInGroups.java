package org.example.gfg;


import java.util.*;

/**
 * *
 * * @author Pratyay
 *
 * Given an array arr[] and an integer K, the task is to reverse every subarray formed by consecutive K elements.
 * todo: will give it a try after some time...
 */

class ReverseArrayInGroups {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int k = 3;
        int [] arr = reverseInGroups(new int[]{
                1, 11, 3, 4, 8, 22, 7
        }, k);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *
     * @param arr
     * @param k
     * @return
     */
    private static int[] reverseInGroups(int [] arr, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while(true){
            if(k >= arr.length){
                break;
            } else if(k % 3 == 0) {
                int[] segmentArr = Arrays.copyOfRange(arr, i, k);
                arrayList = sortedList(segmentArr, arrayList);
                i = k;
                k += k;
            }
        }
        return null;

    }

    private static ArrayList<Integer> sortedList(int[] arr, ArrayList<Integer> list) {
        Arrays.sort(arr);
        list.addAll(Arrays.stream(arr).boxed().toList());
        return list;
    }
}
