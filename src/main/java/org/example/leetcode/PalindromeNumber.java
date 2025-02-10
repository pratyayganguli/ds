package org.example.leetcode;


/**
 * *
 * * @author Pratyay
 */
class PalindromeNumber {

    public static void main(String[] args) {
        if(isPalindrome(1221)){
            System.out.println("palindrome check passed!");
        }
    }

    private static boolean isPalindrome(int num) {
        // use the two pointer approach to solve the problem.

        String str = String.valueOf(num);

        int left = 0;
        int right = str.length() - 1;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
