package p1.java.programs.area;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        // Formula --> area of equilateral triangle = (sqrt(3)/4) * side * side
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side : ");
        int side = sc.nextInt();
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.printf("Area of Equilateral Triangle is: %.2f", area);
    }
}
