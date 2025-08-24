package p4.leetcode;

public class P1281SubtractProductAndSum {

    // LeetCode Link : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }

        return product - sum;
    }
}
