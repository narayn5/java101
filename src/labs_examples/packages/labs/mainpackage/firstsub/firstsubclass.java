package labs_examples.packages.labs.mainpackage.firstsub;

import jdk.dynalink.Operation;
import org.w3c.dom.ls.LSOutput;

public class firstsubclass {

    public int addition(int a, int b) {
        return a+b;
    }

    protected int specialAddition(int a, int b) {
        return (a+b)*100;
    }

    public static void main(String[] args) {
        firstsubclass testOp = new firstsubclass();
        System.out.println("Regular Addition:");
        System.out.println(testOp.addition(3,5));
        System.out.println("Special Addition:");
        System.out.println(testOp.specialAddition(3,5));
    }
}


