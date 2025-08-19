package p1.java.programs;

import java.util.Scanner;

public class PKRToUSDConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in PKR : ");
        int amount = sc.nextInt();
        float usdConversion = amount * 0.0035f;
        System.out.println("Amount In USD : " + usdConversion);
    }
}
