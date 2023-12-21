package leetcodeJava;

//https://leetcode.com/problems/rearrange-spaces-between-words/description/

public class RearrangeSpaces {

    public static String reorderSpaces(String text) {
        int totalSpaces = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                totalSpaces++;
            }
        }
        String[] words = text.trim().split("\\s+");
        int numWords = words.length;

        if (numWords == 1) {
            return words[0] + " ".repeat(totalSpaces);
        }

        int spacesBetweenWords = totalSpaces / (numWords - 1);
        int remainingSpaces = totalSpaces % (numWords - 1);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numWords; i++) {
            result.append(words[i]);
            if (i < numWords - 1) {
                result.append(" ".repeat(spacesBetweenWords));
            }
        }
        result.append(" ".repeat(remainingSpaces));
        return result.toString();
    }
}