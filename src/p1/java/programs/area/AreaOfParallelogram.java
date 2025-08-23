package p1.java.programs.area;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        // Formula --> area of parallelogram = base * height
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int base = sc.nextInt();
        System.out.print("Enter Height : ");
        int height = sc.nextInt();
        sc.close();
        int area = base * height;
        System.out.println("Area of Parallelogram is: " + area);

    }
}
