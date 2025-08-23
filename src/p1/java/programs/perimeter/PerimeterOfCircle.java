package p1.java.programs.perimeter;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        //Formula of Perimeter of Circle = 2 * π * r
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int radius = sc.nextInt();
        sc.close();
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Perimeter of Circle is: %.2f", perimeter);
    }
}
