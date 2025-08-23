package p1.java.methods;

public class Ambiguioty {

    // Java program to illustrate method overloading in varargs

    // Main class demonstrating varargsDemo

    // Method 1
    // varargs method with float datatype
    static void fun(float... x) {

        // Print statement
        // whenever this method is called
        System.out.println("float varargs");
    }

    // Method 2
    // varargs method with int datatype
    static void fun(int... x) {

        // Print statement
        // whenever this method is called
        System.out.println("int varargs");
    }

    // Method 3
    // varargs method with double datatype
    static void fun(double... x) {

        // Print statement
        // whenever this method is called
        System.out.println("double varargs");
    }

    // Method 4
    // Main driver method
    public static void main(String[] args) {


        fun(); // Calling the above methods with no arguments.

        // sum(); // This line will cause a compilation error due to ambiguity
    }


    private static void sum(int a, int b) {
        System.out.println(a + b);
    }

    private static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
