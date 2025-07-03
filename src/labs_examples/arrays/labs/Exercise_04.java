package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] irregularArray = {
                {1,2},
                {2,3,4},
                {3,4,5,6},
        };
        for(int i=0; i< irregularArray.length;i++) {
            for (int j=0;j< irregularArray[i].length;j++) {
                System.out.print(irregularArray[i][j]+" |");
            }
            System.out.println();
        }
    }
}
