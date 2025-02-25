package org.example.neetcode.arrays_hashing;


import java.util.HashMap;
import java.util.Map;

/**
 * *
 * * @author Pratyay
 */
class ContainsDuplicate {

    public boolean solution(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int num: nums) {
            if(frequency.containsKey(num)){
                return true;
            }
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}


