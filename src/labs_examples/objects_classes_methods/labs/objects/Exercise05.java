package labs_examples.objects_classes_methods.labs.objects;

public class Exercise05 {
    public static void main(String[] args) {
        Ex5JetEngine engine747 = new Ex5JetEngine(9000, "Rolls Royce");
        Ex5Flaps flaps747 = new Ex5Flaps(4, "birdflaps");
        Ex5AircraftType aircraftType747 = new Ex5AircraftType("long range", 12000, 8500);
        Ex5FuelTank fuelTank747 = new Ex5FuelTank(12500.756, "jet fuel", 7865.5766);

        Ex5AirCraft Boeing747 = new Ex5AirCraft(engine747, flaps747, aircraftType747, fuelTank747);
        System.out.println(Boeing747.toString());
    }
}

class Ex5AirCraft {
    Ex5JetEngine engine;
    Ex5Flaps flaps;
    Ex5AircraftType typeOfAirCraft;
    Ex5FuelTank fuelTank;

    public Ex5AirCraft(Ex5JetEngine engineType, Ex5Flaps flapsDetails, Ex5AircraftType typeOfAircraft, Ex5FuelTank fuelTank) {
        this.engine = engineType;
        this.flaps = flapsDetails;
        this.typeOfAirCraft = typeOfAircraft;
        this.fuelTank = fuelTank;
    }

    public Ex5AirCraft(Ex5FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public Ex5AirCraft(Ex5JetEngine engine, Ex5FuelTank fuelTank, Ex5AircraftType typeOfAirCraft) {
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.typeOfAirCraft = typeOfAirCraft;
    }

    @Override
    public String toString() {
        return "\nAirCraft{" +
                "engine=" + engine.toString() +
                ", flaps=" + flaps.toString() +
                ", typeOfAirCraft=" + typeOfAirCraft.toString() +
                ", fuelTank=" + fuelTank.toString() +
                '}';
    }
}
class Ex5JetEngine {
    int hp;
    String name;

    public Ex5JetEngine (int Engine_horsepower, String Engine_name){
        this.hp = Engine_horsepower;
        this.name = Engine_name;
    }

    @Override
    public String toString() {
        return "\nJetEngine{" +
                "hp=" + hp +
                ", name='" + name + '\'' +
                '}';
    }
}
class Ex5Flaps {
    int number;
    String type;

    public Ex5Flaps (int numberOfFlaps, String typeOfFlaps) {
        this.number = numberOfFlaps;
        this.type = typeOfFlaps;
    }

    @Override
    public String toString() {
        return "\nFlaps{" +
                "number=" + number +
                ", type='" + type + '\'' +
                '}';
    }
}
class Ex5AircraftType {
    String rangeType;
    int totalMiles;
    int averageMiles;

    public Ex5AircraftType(String aircraftRange, int maximumDistanceFlyable, int meanRangeOfAirplane)  {
        this.rangeType = aircraftRange;
        this.totalMiles = maximumDistanceFlyable;
        this.averageMiles = meanRangeOfAirplane;
    }

    @Override
    public String toString() {
        return "\nAircraftType{" +
                "rangeType='" + rangeType + '\'' +
                ", totalMiles=" + totalMiles +
                ", averageMiles=" + averageMiles +
                '}';
    }
}
class Ex5FuelTank {
    double size;
    String type;
    double currentLevel;
    public Ex5FuelTank (double sizeInGallons, String typeOfFuel, double currentFuelLevel) {
        this.size = sizeInGallons;
        this.type = typeOfFuel;
        this.currentLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "\nFuelTank{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", currentLevel=" + currentLevel +
                '}';
    }
}
