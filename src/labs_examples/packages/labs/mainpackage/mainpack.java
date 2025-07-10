package labs_examples.packages.labs.mainpackage;
import jdk.dynalink.Operation;
import labs_examples.packages.labs.mainpackage.firstsub.firstsubclass;
import labs_examples.packages.labs.mainpackage.secondsub.secondsubclass;
public class mainpack {
    public static void main(String[] args) {

        secondsubclass sup1 = new secondsubclass();
        firstsubclass op1 = new firstsubclass();

        System.out.println("Demonstrating public methods from external packages:");
        System.out.println(sup1.multiply(5,6));
        System.out.println(op1.addition(5,5));

        System.out.println("Demonstrating protected methods from external packages");
//        System.out.println(sup1.specialMultiply(4,4,4));
//        System.out.println(op1.specialAddition(4,4));
    }
}
