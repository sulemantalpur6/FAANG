package p4.leetcode;

public class P1672RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int oldWealth=0;
        for (int[] account : accounts) {
            int totalWealth = 0;
            for (int i : account) {
                totalWealth = totalWealth + i;
            }
            if (oldWealth < totalWealth) {
                oldWealth = totalWealth;
            }
        }
        return oldWealth;
    }
}
