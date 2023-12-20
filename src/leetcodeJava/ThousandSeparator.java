package leetcodeJava;

//https://leetcode.com/problems/thousand-separator/

public class ThousandSeparator {

    public static String thousandSeparator(int n) {
        String numberAsString = String.valueOf(n);
        StringBuilder result = new StringBuilder();

        int count = 0;
        for (int i = numberAsString.length() - 1; i >= 0; i--) {
            result.insert(0, numberAsString.charAt(i));
            count++;

            if (count % 3 == 0 && i != 0) {
                result.insert(0, ".");
            }
        }
        return result.toString();
    }
}