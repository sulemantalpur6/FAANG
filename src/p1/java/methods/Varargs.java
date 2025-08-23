package p1.java.methods;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        printArray(1, 2, 3, 4, 5, 6, 7, 8, 9);
        printArray(); // No arguments
        printArray(1, 2, 3);

        // Note: Varargs must be the last parameter in the method signature.
        // Example of varargs with other parameters
        printMultiple("Hello", 10, 1, 2, 3);

    }

    // Varargs (Variable Arguments) allows a method to accept zero or more arguments of a specified type.
    public static void printArray(int... args) {
        System.out.println(Arrays.toString(args));
    }

    public static void printMultiple(String name, int... args) {

    }

        /*
        This will give a compilation error: "The variable argument type must be the last in the list"
        Because it does not know how many arguments will be passed to the method. So, it cannot determine where the variable arguments end and where the next parameter begins.
        public static void printMultiple(int... args, String name) {
    }*/

    /*
        This will give a compilation error: "The number of variable argument types must be at most one"
        Becuase it does not know how many arguments will be passed to the method. So, it cannot determine where the variable arguments end and where the next parameter begins.
        public static void printMultiple(String name, int... args, String... moreArgs) {
    }*/
}
