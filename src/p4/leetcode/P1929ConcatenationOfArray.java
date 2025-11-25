package p4.leetcode;

public class P1929ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length + length];

        for (int i = 0; i < length; i++) {
            ans[i] = nums[i];
        }

        for (int i = 0; i < length; i++) {
            ans[length + i] = nums[i];
        }

        return ans;
    }
}
