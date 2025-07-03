package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int [] newArray = new int[10];
        for(int i=0; i< 10; i++){
            newArray[i] = (i+1)*7;
        }
        for(int i=9;i>0;i--) {
            if (i%2 == 0) {
                System.out.print(newArray[i]+ " ");
            }
        }
    }
}
