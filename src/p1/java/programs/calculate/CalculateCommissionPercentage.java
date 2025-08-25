package p1.java.programs.calculate;

import static p5.utils.InputUtils.getInt;

public class CalculateCommissionPercentage {
    public static void main(String[] args) {
        float commissionPercent = calculateCommission();
        System.out.printf("Commission Percentage Is : %.2f", commissionPercent);
    }

    private static float calculateCommission() {
        System.out.print("Enter Sales Amount : ");
        int saleAmount = getInt();
        System.out.print("Enter Commission Amount : ");
        int commissionAmount = getInt();

        return ((float) commissionAmount / saleAmount) * 100;
    }
}
