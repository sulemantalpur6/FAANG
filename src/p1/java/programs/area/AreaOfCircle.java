package p1.java.programs.area;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Formula --> area of circle = πr^2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int radius = sc.nextInt();
        sc.close();
        float area = 3.14159f * radius * radius;
        System.out.println("Area of Circle is: " + area);
    }
}
