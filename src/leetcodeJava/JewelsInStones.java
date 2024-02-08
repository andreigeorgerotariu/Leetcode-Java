package leetcodeJava;

//https://leetcode.com/problems/jewels-and-stones/description/

public class JewelsInStones {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}