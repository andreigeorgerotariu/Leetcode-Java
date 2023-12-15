package leetcodeJava;

//https://leetcode.com/problems/defanging-an-ip-address/description/

public class DefangingAnIPAddress {
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}