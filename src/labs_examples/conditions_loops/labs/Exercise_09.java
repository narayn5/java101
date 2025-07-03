package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for(int i=0;i < 100;i+=5) {
            System.out.println("multiples of 5 is " +i);
            if(i >= 95){
                System.out.println("Exited at 95");
                break;
            }
        }
    }
}
