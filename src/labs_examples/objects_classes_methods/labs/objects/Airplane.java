//Following the example in CarExample.java, please use Object Composition to model an Airplane class.
//The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
//The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
//We'll use these a bit later.
// airplane has engines, flaps, type (range), seating, fuel tank

package labs_examples.objects_classes_methods.labs.objects;

import java.lang.reflect.Type;

public class Airplane {
    public static void main(String[] args) {
        JetEngine engine747 = new JetEngine(9000, "Rolls Royce");
        Flaps flaps747 = new Flaps(4, "birdflaps");
        AircraftType aircraftType747 = new AircraftType("long range", 12000, 8500);
        FuelTank fuelTank747 = new FuelTank(12500.756, "jet fuel", 7865.5766);

        AirCraft Boeing747 = new AirCraft(engine747, flaps747, aircraftType747, fuelTank747);
        System.out.println("Boeing 747 Spec Sheet: \n=======================\n"
                +engine747.name+ " Engine that has " + engine747.hp + " horsepower\n"
                +flaps747.number+ " number of flaps\n"
                +aircraftType747.rangeType+ " for flights with maximum distance "+aircraftType747.totalMiles+ " and \n"
                +fuelTank747.size+" number of gallons it can hold\n"
                +fuelTank747.type+" required with current fuel capacity at"+fuelTank747.currentLevel);

    }
}

class AirCraft {
    JetEngine engine;
    Flaps flaps;
    AircraftType typeOfAirCraft;
    FuelTank fuelTank;

    public AirCraft(JetEngine engineType, Flaps flapsDetails, AircraftType typeOfAircraft, FuelTank fuelTank) {
        this.engine = engineType;
        this.flaps = flapsDetails;
        this.typeOfAirCraft = typeOfAircraft;
        this.fuelTank = fuelTank;
    }
}
class JetEngine {
    int hp;
    String name;

    public JetEngine (int Engine_horsepower, String Engine_name){
        this.hp = Engine_horsepower;
        this.name = Engine_name;
    }
}
class Flaps {
    int number;
    String type;

    public Flaps (int numberOfFlaps, String typeOfFlaps) {
        this.number = numberOfFlaps;
        this.type = typeOfFlaps;
    }
}
class AircraftType {
    String rangeType;
    int totalMiles;
    int averageMiles;

    public AircraftType(String aircraftRange, int maximumDistanceFlyable, int meanRangeOfAirplane)  {
        this.rangeType = aircraftRange;
        this.totalMiles = maximumDistanceFlyable;
        this.averageMiles = meanRangeOfAirplane;
    }
}
class FuelTank {
    double size;
    String type;
    double currentLevel;
    public FuelTank (double sizeInGallons, String typeOfFuel, double currentFuelLevel) {
        this.size = sizeInGallons;
        this.type = typeOfFuel;
        this.currentLevel = currentFuelLevel;
    }
}
