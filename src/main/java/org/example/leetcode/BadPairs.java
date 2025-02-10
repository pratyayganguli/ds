package org.example.leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * *
 * * @author Pratyay
 *
 * for an array : 1, 2, 3
 * the total number of pairs will be
 * (1, 1), (1, 2), (1, 3), (2, 1), (2, 2), (2, 3), (3, 1), (3, 2), (3, 3)
 *
 * the total number of pairs in a linear array is always going to be 2^n
 * forget about the invalid pairs for this question
 *
 *
 *
 *
 *
 */

class BadPairs {
    public static void main(String[] args) {
        long badPairCount = getCountBadPairs(new int[] {
                4, 1, 3, 3
        });
        System.out.println(badPairCount);
    }

    private static long getCountBadPairs(int[] nums) {
        int goodPair = 0;
        int len = nums.length;
        long totalPairs = (len*(len-1))/2;

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;
            goodPair += frequency.getOrDefault(key, 0);
            frequency.put(key, frequency.getOrDefault(key, 0) + 1);
        }
        return (totalPairs - goodPair);
    }
}
