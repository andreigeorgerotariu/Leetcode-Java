package leetcodeJava;

//https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}