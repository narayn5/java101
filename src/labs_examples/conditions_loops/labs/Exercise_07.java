package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        String vowels = "aeiou";
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String inputWord = inputScanner.nextLine();

        int i =0;

        while(i < inputWord.length()) {
            char tempChar = inputWord.charAt(i);
            if (vowels.indexOf(tempChar) != -1) {
                System.out.println("Vowel Found! It is:" +tempChar+ " at position "+(i+1));
                break;
            } else {
                i++;
            }
        }

    }
}
