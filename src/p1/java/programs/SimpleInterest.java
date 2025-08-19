package p1.java.programs;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Formula for SI = (P * R * T) / 100
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No of Years: ");
        byte time = sc.nextByte();

        System.out.print("Enter Principal Amount: ");
        int principal = sc.nextInt();

        System.out.print("Enter Interest Rate: ");
        int interest = sc.nextInt();

        float intersetRate = (time * principal * interest) / 100;
        System.out.print("Interest Rate: " + intersetRate);

    }
}
