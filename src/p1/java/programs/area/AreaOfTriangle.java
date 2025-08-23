package p1.java.programs.area;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Formula --> area of triangle = 1/2 * base * height
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int base = sc.nextInt();
        System.out.print("Enter Height : ");
        int height = sc.nextInt();
        float area = 0.5f * base * height;
        System.out.println("Area of Triangle is: " + area);
    }
}
