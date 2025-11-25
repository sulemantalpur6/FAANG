package p4.leetcode;

public class P1480RunningSumIOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                sum[i] = nums[i];
            else
                sum[i] = sum[i - 1] + nums[i];
        }
        return sum;
    }

}
