package p1.java.programs.perimeter;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        // Formula of Perimeter of Equilateral Triangle = 3 * side
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length of the equilateral triangle: ");
        int side = sc.nextInt();
        sc.close();
        int perimeter = 3 * side;
        System.out.println("Perimeter of Equilateral Triangle is: " + perimeter);
    }
}
