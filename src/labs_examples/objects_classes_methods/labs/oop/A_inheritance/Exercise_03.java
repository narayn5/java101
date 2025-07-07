package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Why does the output print in the order it does?
 *
 * You answer:
 * Class A Constructor
 * Class B Constructor
 * Class C Constructor
 * example of constructor of superclass getting called. the output works like as if it is a recursion problem
 * in this case, we have superclass C calling B calling A and output starts printing from superclass then
 * subclass. In this case, A followed by B followed by C.
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1() { System.out.println("Class C Constructor");}
}

public class Exercise_03 {
    public static void main(String[] args) { C_1 c = new C_1();}
}
