package leetcodeJava;

// https://leetcode.com/problems/valid-parentheses/description/

import java.util.LinkedList;

public class ValidParentheses {

    public boolean isValid(String s) {

        LinkedList<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.addLast(c);
            } else if (!stack.isEmpty() && ((c == ')' && stack.getLast() == '(') ||
                    (c == ']' && stack.getLast() == '[') ||
                    (c == '}' && stack.getLast() == '{'))) {
                stack.removeLast();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}