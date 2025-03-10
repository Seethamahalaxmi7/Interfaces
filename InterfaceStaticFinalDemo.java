// Interface with static final variable
interface Vehicle {
    // Static Final Variable (Constant)
    int WHEELS = 4;  // ✅ public static final is implicit
    String TYPE = "Car";

    // Abstract method (to be implemented in a class)
    void start();
}

// Implementing class
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

// Main class
public class InterfaceStaticFinalDemo {
    public static void main(String[] args) {
        System.out.println("=== Interface Static Final Variable Example ===");

        // Accessing static final variables of the interface
        System.out.println("Vehicle Type: " + Vehicle.TYPE);
        System.out.println("Number of Wheels: " + Vehicle.WHEELS);

        // Creating an object of Car class
        Car myCar = new Car();
        myCar.start();
    }
}
