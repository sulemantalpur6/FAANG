package p4.leetcode;

public class P9Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int revNum = 0;
        int tempX = x;
        while (tempX != 0) {
            revNum = revNum * 10 + tempX % 10;
            tempX = tempX / 10;
        }

        return revNum == x;
    }
}
