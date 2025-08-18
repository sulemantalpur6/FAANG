package p1.java.datatype;

/**
 * Primitive data types in Java
 * byte, short, int, long, float, double, char, boolean
 * Primitives are predefined by the language and named by a reserved keyword.
 * They are not objects and hold their values directly in memory.
 * They are stored in the stack memory.
 * They are immutable, meaning their values cannot be changed once assigned.
 * They are passed by value, meaning a copy of the value is passed to methods.
 * They are not synchronized, meaning they are not thread-safe.
 * They are not nullable, meaning they cannot hold a null value.
 * They are not reference types, meaning they do not have methods or properties.
 * They are not boxed, meaning they do not have a wrapper class.
 * They are not serializable, meaning they cannot be converted to a byte stream.
 * They are not comparable, meaning they cannot be compared to other objects.
 * They are not iterable, meaning they cannot be used in a for-each loop.
 * They are not cloneable, meaning they cannot be cloned.
 * They are not final, meaning they can be reassigned.
 * They are not abstract, meaning they cannot be extended.
 * They are not interface types, meaning they cannot implement interfaces.
 */
public class Primitive {
    public static void main(String[] args) {
        byte b = 10;          // 8-bit signed integer 1 byte
        short s = 1000;      // 16-bit signed integer 2 bytes
        int i = 100000;      // 32-bit signed integer 4 bytes
        long l = 100000L;    // 64-bit signed integer 8 bytes
        float f = 10.5f;     // 32-bit floating point 4 bytes
        double d = 20.99;    // 64-bit floating point 8 bytes
        char c = 'A';        // single 16-bit Unicode character
        boolean bool = true;

        System.out.println("Primitive Data Types in Java:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}
