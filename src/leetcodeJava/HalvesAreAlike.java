package leetcodeJava;

//https://leetcode.com/problems/determine-if-string-halves-are-alike/

public class HalvesAreAlike {

    public static boolean halvesAreAlike(String s) {
        int length = s.length();
        String firstHalf = s.substring(0, length / 2);
        String secondHalf = s.substring(length / 2);

        int countA = countVowels(firstHalf);
        int countB = countVowels(secondHalf);

        return countA == countB;
    }

    private static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}