package p4.leetcode;

public class P20ValidParentheses {
    public static boolean isValid(String s) {
        int lastIndex = s.length() - 1;
        for (int i = 0; i < lastIndex; i++) {
            if (s.charAt(i) == s.charAt(lastIndex)) {
                lastIndex--;
                continue;
            }
            return false;
        }
        return true;
    }
}
