package labs_examples.objects_classes_methods.labs.methods;

import java.sql.SQLOutput;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println(multiply(5,5));
        System.out.println(divide(40,8));
        printJoke("This is a joke");
        System.out.println(yearsToSeconds(2));
        arrayPass("hello","world","and","the","universe");

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a*b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a/b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void printJoke(String joke){
        System.out.println(joke);
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long yearsToSeconds(int year) {
        return year*86400*365;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static void arrayPass(String ... word) {
        for (String w: word) {
            System.out.print(w+" ");
        }
    }





}
