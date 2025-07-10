package labs_examples.packages.labs.mainpackage.secondsub;

public class secondsubclass {
    public static int multiply (int a, int b) {
        return a*b;
    }

    protected static int specialMultiply(int a, int b, int c) {
        return (c*a*b)*100;
    }

    public static void main(String[] args) {
        secondsubclass supOp = new secondsubclass();
        System.out.println("Regular Multiplication:");
        System.out.println(supOp.multiply(4,5));
        System.out.println("Special Multiplication:");
        System.out.println(supOp.specialMultiply(4,45,5));
    }
}
