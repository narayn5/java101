


//For each POJO you created to complete the previous Airplane exercise, please change all the instance variables in each
//class to "private". Then, create getter and setter methods (for each instance variable) in each class you created for
//the airplane exercise. Also, create a toString() method in each POJO. Once complete, demonstrate getting and setting
//those variables from the class in which you composed the Airplane object, as well as invoking their toString() methods.


package labs_examples.objects_classes_methods.labs.objects;

public class AirplanePOJO {
    public static void main(String[] args) {
        JetEnginePOJO engine350 = new JetEnginePOJO(10000, "GE Avionics");
        FlapsPOJO flaps350 = new FlapsPOJO(8, "carbon fibre");
        AircraftTypePOJO type350 = new AircraftTypePOJO("medium range",9000, 7500);
        FuelTankPOJO fueltank350 = new FuelTankPOJO(12000,"hydrocarbon-synthetic",3456);
        AirCraftPOJO airbus350 = new AirCraftPOJO(engine350, flaps350, type350, fueltank350);

        System.out.println(airbus350.toString());
    }
}

class AirCraftPOJO {
    protected JetEnginePOJO engine;
    protected FlapsPOJO flaps;
    protected AircraftTypePOJO typeOfAirCraft;
    protected FuelTankPOJO fuelTank;

    public AirCraftPOJO(JetEnginePOJO engineType,
                        FlapsPOJO flapsDetails,
                        AircraftTypePOJO typeOfAircraft,
                        FuelTankPOJO fuelTank) {
        this.engine = engineType;
        this.flaps = flapsDetails;
        this.typeOfAirCraft = typeOfAircraft;
        this.fuelTank = fuelTank;
    }

    public void setAirCraft(JetEnginePOJO engine, FlapsPOJO flaps,
                            AircraftTypePOJO typeOfAirCraft, FuelTankPOJO fuelTank) {
        this.engine = engine;
        this.flaps = flaps;
        this.typeOfAirCraft = typeOfAirCraft;
        this.fuelTank = fuelTank;
    }

    public JetEnginePOJO getEngine() {
        return engine;
    }

    public FlapsPOJO getFlaps() {
        return flaps;
    }

    public AircraftTypePOJO getTypeOfAirCraft() {
        return typeOfAirCraft;
    }

    public FuelTankPOJO getFuelTank() {
        return fuelTank;
    }

    public String toString() {
        return "Engine type is " + engine.toString() + "\n with flaps " + flaps.toString()
                + "\n where the type of aircraft " + typeOfAirCraft.toString() + "\n and as far as fuel is concerned " +fuelTank.toString();
    }

}


class JetEnginePOJO {
    protected int hp;
    protected String name;

    // constructor
    public JetEnginePOJO (int Engine_horsepower, String Engine_name){
        this.hp = Engine_horsepower;
        this.name = Engine_name;
    }

    public void setJetEnginePOJO (int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public int getJetEngineHP () {
        return hp;
    }

    public String getJetEngineName () {
        return name;
    }

    public String toString() {
        return "Engine horsepower is  " + hp + " name of the engine " + name;
    }
}

class FlapsPOJO {
    protected int number;
    protected String type;

    public FlapsPOJO (int numberOfFlaps, String typeOfFlaps) {
        this.number = numberOfFlaps;
        this.type = typeOfFlaps;
    }

    public void setFlaps (int number, String type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber () {
        return number;
    }

    public String getType () {
        return type;
    }

    public String toString() {
        return "Number of flaps  " + number + " and type of flaps " + type;
    }
}

class AircraftTypePOJO {
    protected String rangeType;
    protected int totalMiles;
    protected int averageMiles;

    public AircraftTypePOJO(String aircraftRange, int maximumDistanceFlyable, int meanRangeOfAirplane)  {
        this.rangeType = aircraftRange;
        this.totalMiles = maximumDistanceFlyable;
        this.averageMiles = meanRangeOfAirplane;
    }

    public void setAircraftType (String rangeType, int totalMiles, int averageMiles) {
        this.rangeType = rangeType;
        this.totalMiles = totalMiles;
        this.averageMiles = averageMiles;
    }

    public String getAircraftType () {
        return rangeType;
    }

    public int getTotalMiles() {
        return totalMiles;
    }

    public int getAverageMiles() {
        return averageMiles;
    }

    public String toString() {
        return "Aircraft range is  " + rangeType + " and can travel maximum of " + totalMiles + " with avg " +averageMiles;
    }
}

class FuelTankPOJO {
    protected double size;
    protected String type;
    protected double currentLevel;
    public FuelTankPOJO (double sizeInGallons, String typeOfFuel, double currentFuelLevel) {
        this.size = sizeInGallons;
        this.type = typeOfFuel;
        this.currentLevel = currentFuelLevel;
    }
    public void setFuelTank (double size, String type, double currentLevel) {
        this.size = size;
        this.type = type;
        this.currentLevel = currentLevel;
    }
    public double getFuelTankSize() {
        return size;
    }
    public String getFuelTankType() {
        return type;
    }
    public double getFuelTankCurrentLevel() {
        return currentLevel;
    }
    public String toString() {
        return "Fuel tank is  " + size + " gallons, taking " + type + " type of fuel and currently it contains " + currentLevel;
    }
}
