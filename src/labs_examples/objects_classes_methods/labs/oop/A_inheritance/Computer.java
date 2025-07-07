//Create at least 5 classes that demonstrate an labs_examples.inheritance hierachy. The depth of the hiearchy must be at least 3. Meaning:
//A extends B, B extends C. Classes A, B, and C define an labs_examples.inheritance hierachy with a depth of 3. Create a real-world
//labs_examples.inheritance hierarchy. For instance you could create an labs_examples.inheritance hiearchy using animals, or food, or the solar system,
//or stores, restaurants, adventures, and really anything else you can imagine. Have some fun with it. Try to challenge
//yourself.

// ComputerType has two children, desktop and laptop
//

package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

class ComputerType {
    int numberOfKeys;
    boolean externalMouse;
    public ComputerType() {
        numberOfKeys = 104;
        externalMouse = true;
    }
    public ComputerType(int numberOfKeys, boolean externalMouse) {
        this.numberOfKeys = numberOfKeys;
        this.externalMouse = externalMouse;
    }
}

class Desktop extends ComputerType {
    public Desktop() {
        numberOfKeys = 0;
        externalMouse = false;
    }
    public Desktop(int keysKeyboard, boolean externalMouse) {
        this.numberOfKeys = keysKeyboard;
        this.externalMouse = externalMouse;
    }
    public void turnOn() {
        System.out.println("Beep Beep Beep... Desktop BIOS loading... Beep Beep Beep...");
    }
}

class Laptop extends Desktop {
    public Laptop() {
        numberOfKeys = 0;
        externalMouse = false;
    }
    public Laptop(int keys, boolean externalMouse){
        this.numberOfKeys = keys;
        this.externalMouse = externalMouse;
    }

    @Override
    public void turnOn() {
        System.out.println("Swoosh... Swoosh... Laptop Turning on...");
    }

    public void switchOnHistory() {
        System.out.println("Historically, this is how things sounded like:");
        super.turnOn();
        this.turnOn();
    }

}

class TouchDevices extends Desktop {
    boolean touchScreenEnabled;
    public TouchDevices() {
        super();
        touchScreenEnabled = true;
    }
    public TouchDevices(int numberOfKeys, boolean externalMouse, boolean touchScreen) {
        super(numberOfKeys, externalMouse);
        this.touchScreenEnabled = touchScreen;
    }

    @Override
    public void turnOn() {
        System.out.println("click click... Android Logo! Click click...");
    }
}

class Tablets extends TouchDevices {
    String screenSize;
    public Tablets(){
        super();
        screenSize = "";
    }
    public Tablets(int numberOfKeys, boolean externalMouse, boolean TouchScreen, String screenSize){
        super(numberOfKeys, externalMouse, TouchScreen);
        this.screenSize = screenSize;
    }

}

class SmartPhones extends TouchDevices {
    boolean makeCalls;
    public SmartPhones(){
        super();
        makeCalls = false;
    }
    public SmartPhones(int numberOfKeys, boolean externalMouse, boolean TouchScreen, boolean makeCalls) {
        super(numberOfKeys, externalMouse, TouchScreen);
        this.makeCalls = makeCalls;
    }

    @Override
    public String toString() {
        return "SmartPhones{" +
                "makeCalls=" + makeCalls +
                ", touchScreenEnabled=" + touchScreenEnabled +
                ", numberOfKeys=" + numberOfKeys +
                ", externalMouse=" + externalMouse +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("No clicks and beeps;\njust One press and- \nhere is your home screen!");
    }
}

public class Computer {
    public static void main(String[] args) {
        System.out.println("Calling the first generation subclass called Desktop");
        Desktop windowsServer = new Desktop(104, true);
        windowsServer.turnOn();
        System.out.println("\nCalling second generation subclass Laptop");
        Laptop dellLatitude = new Laptop(78,false);
        dellLatitude.turnOn();
        dellLatitude.switchOnHistory();
        System.out.println("\nCalling third generation subclass iPhone");

        SmartPhones iPhone = new SmartPhones(0,false, true, true);
        System.out.println(iPhone.toString());
        iPhone.turnOn();
    }
}
