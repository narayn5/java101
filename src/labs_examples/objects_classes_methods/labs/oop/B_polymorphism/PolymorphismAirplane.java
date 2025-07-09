/*
* interface: airplane
* overloading: method
* overriding: parent class to child class
* */

package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class PolymorphismAirplane implements AirplaneConfig{

    @Override
    public void Engine() {
        System.out.println("Engine starting...");
    }

    @Override
    public boolean longRange() {
        return false;
    }

    @Override
    public void FlightInfo() {
        System.out.println("Cessna AirCraft");
        System.out.println("100 passengers");
    }

    public static void main(String[] args) {
        PolymorphismAirplane p = new PolymorphismAirplane();
        p.FlightInfo();
        p.Engine();
        System.out.println("Cessna AirCraft is Long Range? "+p.longRange());
    }
}
