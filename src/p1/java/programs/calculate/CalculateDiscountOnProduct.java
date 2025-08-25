package p1.java.programs.calculate;

import static p5.utils.InputUtils.getInt;

public class CalculateDiscountOnProduct {
    public static void main(String[] args) {
        float discount = calculateDiscount();
        System.out.printf("Discount Percentage On Is : %.2f", discount);
    }

    private static float calculateDiscount() {
        System.out.print("Enter Marked Price : ");
        int markedPrice = getInt();
        System.out.print("Enter Selling Price : ");
        int sellingPrice = getInt();

        int discount = markedPrice - sellingPrice;
        return ((float) discount / markedPrice) * 100;
    }
}
