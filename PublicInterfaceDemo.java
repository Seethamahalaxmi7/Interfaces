// Interface (without 'public' to keep everything in one file)
interface Vehicle {
    // Fields (constants) - always public, static, and final
    int WHEELS = 4;
    String TYPE = "Car";

    // Abstract method (must be implemented)
    void start();
}

// Class implementing the interface
class Car implements Vehicle {
    // Implementing the method from the interface
    public void start() {
        System.out.println("Car is starting...");
    }
}

// Main class
public class PublicInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== Public Interface Example ===");

        // Creating an object of Car class
        Car myCar = new Car();

        // Printing interface field values
        System.out.println("Vehicle Type: " + Vehicle.TYPE);
        System.out.println("Number of Wheels: " + Vehicle.WHEELS);

        // Calling the implemented method
        myCar.start();
    }
}

