package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] matrixOne = new int[5][5];
        for(int i=0; i < 5; i++) {
            for(int j=0; j<5;j++){
                matrixOne[i][j] = (i+1)*(j+1)*3;
            }
        }
        for(int i=0; i < 5; i++) {
            for(int j=0; j< 5;j++){
                System.out.print(matrixOne[i][j]+" |");
            }
            System.out.println();
        }
    }
}
