package org.example.platforms.leetcode;


import java.util.HashMap;

/**
 * * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * * @author Pratyay
 */
class RomanInteger {

    public static void main(String[] args) {
        int res = fromRomanToInteger("MCMXCIV");
        System.out.println(res);
    }

    private static int fromRomanToInteger(String str) {
        HashMap<Character, Integer> romanDictionary = new HashMap<>();
        romanDictionary.put('I', 1);
        romanDictionary.put('V', 5);
        romanDictionary.put('X', 10);
        romanDictionary.put('L', 50);
        romanDictionary.put('C', 100);
        romanDictionary.put('D', 500);
        romanDictionary.put('M', 1000);

        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            System.out.println(romanDictionary.get(key) + ", " + res);
            if(i > 0) {
                if (str.charAt(i - 1) == 'I' && (str.charAt(i) == 'V' || str.charAt(i) == 'X')) {
                   res += romanDictionary.getOrDefault(key, 0) - romanDictionary.getOrDefault(str.charAt(i-1), 0);
                }

                else if (str.charAt(i - 1) == 'X' && (str.charAt(i) == 'L' || str.charAt(i) == 'C')) {
                    res += romanDictionary.getOrDefault(key, 0) - romanDictionary.getOrDefault(str.charAt(i-1), 0);
                }

                else if (str.charAt(i - 1) == 'C' && (str.charAt(i) == 'D' || str.charAt(i) == 'M')) {
                    res += romanDictionary.getOrDefault(key, 0) - romanDictionary.getOrDefault(str.charAt(i-1), 0);
                }
                else{
                    res += romanDictionary.getOrDefault(key, 0);
                }
            }
            else {
                res += romanDictionary.getOrDefault(key, 0);
            }
        }
        return res;
    }
}
