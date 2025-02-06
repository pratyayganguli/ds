package org.example.coderbyte;


/**
 * *
 * * @author Pratyay
 */

import java.util.HashSet;
import java.util.logging.Logger;

/**
 *
 *
 *FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements:
 * the first element will represent a list of comma-separated numbers sorted in ascending order,
 * the second element will represent a second list of comma-separated numbers (also sorted).
 * Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order.
 * If there is no intersection, return the string false.
 *
 * Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
 * Output: 1,4,13
 */


class FindIntersection {
    private static final Logger LOGGER = Logger.getLogger(FindIntersection.class.getName());

    public static void main(String[] args) {
        solution(new String[] {"1, 5, 6, 7, 10, 11, 12", "5, 6, 8, 11, 17"});
    }

    private static String solution(String[] str) {
        HashSet<String> hashSet = new HashSet<>();
        String res = new String();
        for(String val: str) {
            String[] strArray = val.split(",");
            for(String c: strArray) {
                if(hashSet.contains(c)){
                    res = res.concat(c).concat(",");
                }
                hashSet.add(c);
            }
        }
        int len = res.length();
        res = res.substring(0, len-1);
        return res;
    }
}


