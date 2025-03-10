// Interface with fields (all are public static final)
interface Vehicle {
    int WHEELS = 4; // ✅ Allowed (public static final)
    String TYPE = "Car"; // ✅ Allowed

    void start(); // Abstract method
}

// Class implementing the interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

// Main class
public class InterfaceFieldsDemo {
    public static void main(String[] args) {
        System.out.println("=== Interface Fields Example ===");

        // Accessing interface fields
        System.out.println("Vehicle Type: " + Vehicle.TYPE);
        System.out.println("Number of Wheels: " + Vehicle.WHEELS);

        // Creating object and calling method
        Car myCar = new Car();
        myCar.start();
    }
}
