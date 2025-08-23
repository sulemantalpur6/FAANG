package p1.java.switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Fruit Name: ");
        String fruit = scanner.nextLine();

        System.out.println("With break statement:");
        switch (fruit.toLowerCase()) {
            case "mango":
                System.out.println("King of Fruits");
                break;
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "banana":
                System.out.println("A long yellow fruit");
                break;
            case "orange":
                System.out.println("A round citrus fruit");
                break;
            case "grape":
                System.out.println("A small round fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit name");
        }

        // Without break statement
        System.out.println("\nWithout break statement:");
        switch (fruit) {
            case "mango":
                System.out.println("King of Fruits");
            case "apple":
                System.out.println("A sweet red fruit");
            case "banana":
                System.out.println("A long yellow fruit");
            case "orange":
                System.out.println("A round citrus fruit");
            case "grape":
                System.out.println("A small round fruit");
            default:
                System.out.println("Please enter a valid fruit name");
        }


        // Default case in the middle
        System.out.println("\nDefault case in the middle with break:");
        switch (fruit) {
            case "mango":
                System.out.println("King of Fruits");
                break;
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit name");
                break;
            case "banana":
                System.out.println("A long yellow fruit");
                break;
            case "orange":
                System.out.println("A round citrus fruit");
                break;
            case "grape":
                System.out.println("A small round fruit");
                break;
        }


        // Default case in the middle
        System.out.println("\nDefault case in the middle without break:");
        switch (fruit) {
            case "mango":
                System.out.println("King of Fruits");
            case "apple":
                System.out.println("A sweet red fruit");
            default:
                System.out.println("Please enter a valid fruit name");
            case "banana":
                System.out.println("A long yellow fruit");
            case "orange":
                System.out.println("A round citrus fruit");
            case "grape":
                System.out.println("A small round fruit");
        }


        // Grouping cases
        System.out.println("\nGrouping cases:");
        System.out.println("Enter a day number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It's a weekday");
                break;
            case 6:
            case 7:
                System.out.println("It's a weekend");
                break;
        }
    }
}
