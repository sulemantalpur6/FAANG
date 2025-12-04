package p4.leetcode;

public class P26RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2});
        removeDuplicates(new int[]{0, 1, 1, 2, 2, 3, 3, 3});
    }

    // My Solution
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static int removeDuplicatesOptimal(int[] nums) {
        int k = 1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
