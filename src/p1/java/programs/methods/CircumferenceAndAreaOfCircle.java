package p1.java.programs.methods;

import static p5.utils.InputUtils.getInt;

public class CircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        // Circumference = 2 π r
        // Area = π (r2)

        System.out.print("Enter Radius :");
        int radius = getInt();

        findCircumferenceAndAreaOfCircle(radius);

    }

    private static void findCircumferenceAndAreaOfCircle(int radius) {
        float circumference = (float) (2 * 3.14 * radius);
        float area = (float) (3.14 * (radius * radius));

        System.out.println("Circumference : " + circumference + "\nArea : " + area);
    }
}
