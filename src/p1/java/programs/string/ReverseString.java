package p1.java.programs.string;

import static p5.utils.InputUtils.getString;

public class ReverseString {
    public static void main(String[] args) {
        /*
         * Input = Suleman
         * Output = nameluS
         */
        System.out.print("Enter a string to reverse :");
        String string = getString();

        mineSolution(string);
        optimizedSolution(string);
    }

    private static void optimizedSolution(String string) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString.append(string.charAt(i));
        }
        System.out.println(reversedString);
    }

    private static void mineSolution(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
        System.out.println();
    }
}
