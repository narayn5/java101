package labs_examples.static_nonstatic.labs;

public class StaticDemo {
    public static void printOne () {
        System.out.println("Calling the print one method");
    }

    public static void printTwo() {
        System.out.println("Calling the print two method");
    }

    public void printThree() {
        System.out.println("Calling the non-static print three method");
    }

    public void printFour() {
        System.out.println("Calling the non-static print four method");
    }

    public static void s2s() {
        printOne();
        printTwo();
    }

    public void nonS2s(){
        printOne();
    }

    public void nonS2nonS() {
        printThree();
        printFour();
    }

    public static void main(String[] args) {

        System.out.println("\nStatic to Static method:");
        s2s();

        System.out.println("\nStatic Main to non-Static printThree:");
        StaticDemo callOne = new StaticDemo();
        callOne.printThree();

        System.out.println("\nNon-Static to static:");
        callOne.nonS2s();

        System.out.println("\nNon-static to non-static:");
        callOne.nonS2nonS();

        AnotherStaticDemo asdemo = new AnotherStaticDemo();
        System.out.println("\nCalling a static method from a different class:");
        AnotherStaticDemo.ASone();
        System.out.println("\nCalling a non-static method from a different class:");
        asdemo.ASthree();

        System.out.println("\ncalling a non-static method from static method from another class:");
        asdemo.ASfour();

        System.out.println("\ncalling a static method from non-static method from another class");
        AnotherStaticDemo.ASfive();
    }

}

class AnotherStaticDemo {
    public static void ASone() {
        System.out.println("calling a method ASone from another class");
    }
    public static void AStwo() {
        System.out.println("calling a method AStwo from another class");
    }
    public void ASthree() {
        System.out.println("calling a non-static method from another class");
    }
    public void ASfour() {
        AStwo();
        System.out.println("calling a static method from non-static from antoher class");
    }
    public static void ASfive() {
        AnotherStaticDemo s2ns = new AnotherStaticDemo();
        s2ns.ASthree();
    }


}