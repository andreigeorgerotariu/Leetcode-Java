package leetcodeJava;

// https://leetcode.com/problems/valid-parentheses/description/

public class ValidParentheses {

    public boolean isValid(String s) {

        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                count++;
            } else if (c == ')' && count > 0) {
                count--;
            } else if (c == ']' && count > 0) {
                count--;
            } else if (c == '}' && count > 0) {
                count--;
            } else {
                return false;
            }
        }
        return count == 0;
    }
}