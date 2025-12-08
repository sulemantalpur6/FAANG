package p4.leetcode;


public class P27RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int num : nums) {
            if (num == val) {
                k--;
            }
        }
        return k;
    }
}
