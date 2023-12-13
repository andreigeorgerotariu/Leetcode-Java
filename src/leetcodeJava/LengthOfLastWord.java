package leetcodeJava;

//https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int lastSpaceIndex = trimmed.lastIndexOf(' ');
        return trimmed.length() - lastSpaceIndex - 1;
    }
}