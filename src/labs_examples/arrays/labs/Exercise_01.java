package labs_examples.arrays.labs;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int[] newArray = new int[10];
        for (int i=0; i < 10; i++) {
            System.out.println("Enter number "+i);
            newArray[i] = inputScanner.nextInt();
        }
        int sum = 0;
        for (int k : newArray) {
            sum += k;
        }
        System.out.println("Sum is "+sum);
    }
}