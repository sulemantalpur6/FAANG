package p1.java.programs.calculate;

import static p5.utils.InputUtils.getInt;

public class CalculateAverageOfNumber {
    public static void main(String[] args) {
        float avg = calculateAverage();
        System.out.printf("Average Of Number Is : %.1f", avg);
    }

    private static float calculateAverage() {
        System.out.print("Enter Number to Find Average : ");
        int n = getInt();
        float sum = 0;

        if (n < 1) {
            System.out.println("Number Must Be Positive");
            return 0;
        }

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum / n;
    }
}
