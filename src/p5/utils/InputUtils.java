package p5.utils;

import java.util.Scanner;

/**
 * Utility class for handling user input.
 * Provides methods to get the user input of different types.
 */
public class InputUtils {

    static Scanner sc = new Scanner(System.in);

    /**
     * Private constructor to prevent instantiation of the utility class.
     */
    private InputUtils() {
        throw new UnsupportedOperationException("Utility class can't be instantiated");
    }

    /**
     * Method to get char input from the user.
     *
     * @return the char input from the user
     */
    public static char getChar() {
        return sc.next().charAt(0);
    }

    /**
     * Method to get integer input from the user.
     *
     * @return the integer input from the user
     */
    public static int getInt() {
        return sc.nextInt();
    }

    /**
     * Method to get float input from the user.
     *
     * @return the float input from the user
     */
    public static float getFloat() {
        return sc.nextFloat();
    }

    /**
     * Method to get string input from the user.
     *
     * @return the string input from the user
     */
    public static String getString() {
        return sc.nextLine();
    }
}
