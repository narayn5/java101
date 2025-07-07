package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: variable i in the class A prints here. We have declared class A's
 * object "a" as "A a" and initialized to "new B()"
 * B extends A which means subclass inherits parent class's variables and methods;
 * Even though Class B has the variable i, declared object references the class A and hence it is
 * printing 10.
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {
    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}