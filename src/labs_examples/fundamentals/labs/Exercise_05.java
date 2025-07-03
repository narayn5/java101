package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";

        // please declare an int variable below, and set it to the value of the length of "str"
        int strLength = str.length();
        System.out.println("length of the first string as an integer here: " +strLength);
        String str2 = "hello";

        // please initialize a boolean variable and test whether str is equal to str2
        boolean checker = str.equals(str2);
        System.out.println("Are the two strings equal? "+checker);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println("replacing a character in str " + str.replace("h","y"));
        System.out.println("substring of str" + str.substring(2,3));
        System.out.println("containing an o in the string: " + str.contains("o"));
        System.out.println("finding the index of o: " + str.indexOf("o"));

    }


}