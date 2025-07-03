package labs_examples.fundamentals.labs;

import java.net.SocketOption;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        boolean a = true;
        System.out.println("boolean a is: "+a);

        byte smallValue = 78;
        System.out.println("byte smallvalue is: "+smallValue);

        char newChar = 'c';
        System.out.println("char newChar is: "+newChar);

        short shortInteger = 35;
        System.out.println("short shortInteger is: "+shortInteger);

        long longInteger = 357846358;
        System.out.println("long longInteger is : " +longInteger);

        float myFloatingPoint = 8745.33f;
        System.out.println("float myFloatingPoint is : " +myFloatingPoint);

        double myDouble = 394875.345;
        System.out.println("double myDouble is : " +myDouble);
    }

}
