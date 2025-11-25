package p4.leetcode;

public class P1920BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int numsLength = nums.length;
        int[] ans = new int[numsLength];
        for (int i=0 ; i < numsLength; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
