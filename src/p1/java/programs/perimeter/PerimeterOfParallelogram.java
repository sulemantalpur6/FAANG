package p1.java.programs.perimeter;

import static utils.InputUtils.getInt;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        // Formula --> perimeter of parallelogram = 2 * (base + side)
        System.out.print("Enter Base : ");
        int base = getInt();
        System.out.print("Enter Side : ");
        int side = getInt();

        int perimeter = 2 * (base + side);
        System.out.println("Perimeter of Parallelogram : " + perimeter);
    }
}
