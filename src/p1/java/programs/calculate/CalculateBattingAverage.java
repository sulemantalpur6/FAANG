package p1.java.programs.calculate;

import static p5.utils.InputUtils.getInt;

public class CalculateBattingAverage {
    public static void main(String[] args) {
        float avg = calculateBattingAverage();
        System.out.println("Average Of Player Is : " + avg);
    }

    private static float calculateBattingAverage() {
        System.out.print("Enter No. of Runs : ");
        int r = getInt();
        System.out.print("Enter No. Of Matches : ");
        int m = getInt();
        System.out.print("Enter No. of Not Outs : ");
        int n = getInt();
        return (float) r / (m - n);
    }
}
