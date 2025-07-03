package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        float radius = 3.14f;
        int height = 5;

        double cylinderVolume;
        cylinderVolume = 3.14*(radius*radius)*height;
        System.out.println("volumne of the cylinder is " +cylinderVolume);

    }
}