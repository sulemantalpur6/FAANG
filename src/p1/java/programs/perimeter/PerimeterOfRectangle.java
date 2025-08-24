package p1.java.programs.perimeter;

import static p5.utils.InputUtils.getInt;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        // Formula --> perimeter of rectangle = 2 * (length + width)
        System.out.print("Enter Length : ");
        int length = getInt();
        System.out.print("Enter Width : ");
        int width = getInt();
        int perimeter = 2 * (length + width);
        System.out.print("Perimeter of Rectangle : " + perimeter);
    }
}
