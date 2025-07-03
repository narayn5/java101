package labs_examples.arrays.labs;
import java.util.ArrayList;
/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        // declare
        ArrayList<Integer> firstAL = new ArrayList<Integer>();

        // populate
        firstAL.add(5);
        firstAL.add(12);
        firstAL.add(8);

        // access
        for (int x : firstAL) {
            System.out.print("Values are "+x+" ");
        }
        System.out.println();

        // size
        System.out.println("Size of the array list is "+firstAL.size());

        // get
        System.out.println("Get the second item in the array list"+firstAL.get(2));

        // indexOf
        System.out.println("Get the index of value 8 "+firstAL.indexOf(8));

        // clone
        ArrayList<Integer> cloneAL = (ArrayList<Integer>) firstAL.clone();
        System.out.println("Clone of first array list"+cloneAL);

        // remove
        System.out.println("removing element at index 1"+firstAL.remove(1));

        // clear
        firstAL.clear();
        System.out.println("cleared all elements in array list "+firstAL);


    }
}
