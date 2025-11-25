package p4.leetcode;

public class P1351CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int negative = 0;
        for(int[] m : grid) {
            for(int n : m) {
                if(n < 0) {
                    negative++;
                }
            }
        }
        return negative;
    }
}
