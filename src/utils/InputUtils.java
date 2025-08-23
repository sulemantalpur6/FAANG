package utils;

import java.util.Scanner;

/**
 * Utility class for handling user input.
 * Provides methods to get the user input of different types.
 */
public class InputUtils {

    /**
     * Private constructor to prevent instantiation of the utility class.
     */
    private InputUtils() {
        throw new UnsupportedOperationException("Utility class can't be instantiated");
    }

    /**
     * Method to get integer input from the user.
     *
     * @return the integer input from the user
     */
    public static int getInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * Method to get string input from the user.
     *
     * @return the string input from the user
     */
    public static String getString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
