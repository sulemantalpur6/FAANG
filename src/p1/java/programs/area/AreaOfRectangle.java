package p1.java.programs.area;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        // Formula --> area of rectangle = length * breadth
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Breadth :");
        int breadth = sc.nextInt();
        System.out.print("Enter Height :");
        int height = sc.nextInt();

        int area = breadth * height;
        System.out.println("Area of Rectangle is: " + area);

    }
}
