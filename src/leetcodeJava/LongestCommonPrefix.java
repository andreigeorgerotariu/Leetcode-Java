package leetcodeJava;

//https://leetcode.com/problems/longest-common-prefix/description/

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length - 1];

        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < firstString.length(); i++) {
            if (i < lastString.length() && firstString.charAt(i) == lastString.charAt(i)) {
                commonPrefix.append(firstString.charAt(i));
            } else {
                break;
            }
        }
        return commonPrefix.toString();
    }
}