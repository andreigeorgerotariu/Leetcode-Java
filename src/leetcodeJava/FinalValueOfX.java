package leetcodeJava;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

public class FinalValueOfX {
    public static int finalValueAfterOperations(String[] operations) {

        int X = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                X++;
            } else {
                X--;
            }
        }
        return X;
    }
}