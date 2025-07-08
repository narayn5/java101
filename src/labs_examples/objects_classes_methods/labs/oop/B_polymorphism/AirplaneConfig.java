package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public interface AirplaneConfig() {
    public void Engine();
    public void FlightInfo();
    public boolean longRange();
    public default void eatIceCream() {
        System.out.println("cant eat icecream here");
    }
}