package leetcodeJava;

// https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        String compare = Integer.toString(x);
        int left = 0;
        int right = compare.length() - 1;

        while (left < right) {
            if (compare.charAt(left) != compare.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}