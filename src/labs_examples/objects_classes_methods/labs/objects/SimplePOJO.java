//For this exercise please create two classes. The first class is the controller and it will contain the main() method.
//The second class is a POJO. Just a simple object type class that defines an object. In this POJO, demonstrate
//at least three overloaded constructors. In the main() method, create at least 3 objects of your POJO class, each using
//a different constructor.

package labs_examples.objects_classes_methods.labs.objects;

public class SimplePOJO {
    public static void main(String[] args) {
        Person captainCrunch = new Person(14, "Captain Crunch", 234.876);
        Person bruceBanner = new Person(17, 876.88);
        Person michaelScott = new Person(99, "Mike Scott");
        System.out.println(captainCrunch.id + " Name " + captainCrunch.name+ " weighing "+ captainCrunch.weight+ " pounds");
        System.out.println(bruceBanner.id + " weighing "+ bruceBanner.weight+ " pounds");
        System.out.println("guy named "+michaelScott.name+ " with the id "+michaelScott.id);
    }
}

class Person {
    int id;
    String name;
    double weight;

    public Person(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
    public Person(int personId, double personWeight) {
        this.id = personId;
        this.weight = personWeight;
    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}