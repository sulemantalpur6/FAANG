package p1.java.datatype;

import java.util.Scanner;

public class TypeConversionCastingPromotion {
    public static void main(String[] args) {

        /* Type Conversion
            Implicit Type Conversion (Widening Conversion). Here you try to add an integer as an input but the result will be float.
           e.g., Input = 10, Output = 10.0 */

        Scanner input = new Scanner(System.in);
        float intInput = input.nextFloat();
        System.out.println("Added Input Integer But Result Is Float : " + intInput);

        char charValue = 'A';      // 'A' is a character literal
        int charToIntValue = charValue;
        System.out.println("Converted Character To Integer (ASCII Value): " + charToIntValue);


        /* Type Casting
        Explicit Type Conversion (Narrowing Conversion). Here you try to convert a float to an integer.
        Means you try to convert a larger type to a smaller type explicitly.*/
        float floatValue = 10.5f;
        int intValue = (int) floatValue;
        System.out.println("Converted Float To Integer : " + intValue);

        double doubleValue = 10.5;
        int intValueFromDouble = (int) doubleValue; // Explicitly casting double to int
        System.out.println("Converted Double To Integer : " + intValueFromDouble);


        int intValueGreaterThenUnsignedByte = 450;
        byte byteValue = (byte) intValueGreaterThenUnsignedByte;
        System.out.println("Converted Integer Greater Than Unsigned Byte To Byte (Overflow): " + byteValue); // Will show overflow due to byte limit (-128 to 127)

        int intValueGreaterThenSignedByte = 257;
        byte signedByteValue = (byte) intValueGreaterThenSignedByte;
        System.out.println("Converted Integer Greater Than Signed Byte To Byte (Overflow): " + signedByteValue); // Will show overflow due to byte limit (-128 to 127)



        /* Type Promotion
         In Java, when you perform arithmetic operations on mixed data types, the smaller data type is promoted to the larger data type.
         For example, if you add an int and a float, the int is promoted to a float before the addition. */
        int intValueTypePromotion = 5;
        float floatValueTypePromotion = 10.5f;
        float typePromotionResult = intValueTypePromotion + floatValueTypePromotion; // 'a' is promoted to float

        int intValueChar = 'A'; // char 'A' is promoted to int (ASCII value 65)
        float floatValueCharTypePromotion = 'A'; // char 'A' is promoted to float (ASCII value 65.0)

        char typeChar = 'A';
        float typePromotionCharResult = typeChar + 10.5f; // char 'A' is promoted to float (ASCII value 65.0 + 10.5)

        System.out.println("Type Promotion Results:" +
                "\nint + float: " + typePromotionResult +
                "\nchar to int: " + intValueChar +
                "\nchar to float: " + floatValueCharTypePromotion +
                "\nchar + float: " + typePromotionCharResult);


        // Complete Results

        byte b = 10;          // 8-bit signed integer 1 byte
        short s = 1000;      // 16-bit signed integer 2 bytes
        int i = 100000;      // 32-bit signed integer 4 bytes
        long l = 100000L;    // 64-bit signed integer 8 bytes
        float f = 10.5f;     // 32-bit floating point 4 bytes
        double d = 20.99;    // 64-bit floating point 8 bytes
        char c = 'A';        // single 16-bit Unicode character

        double result = (b * s) + (i / l) + f + (d * c);
        System.out.println("byte * short : " + (b * s) + "\n int * long : " + (i / l) + "\n float: " + f + "\n double * char : " + (d * c));
        System.out.println("Final Result of All Operations: " + result);


    }
}
