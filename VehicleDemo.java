// Defining an interface with two methods
interface Vehicle {
    void start();  // Abstract method (must be implemented)
    void stop();   // Abstract method (must be implemented)
}

// Abstract class implementing only one method
abstract class Car implements Vehicle {
    // Implementing only one method
    public void start() {
        System.out.println("Car is starting...");
    }
    // 'stop()' is not implemented, so this class must be abstract
}

// Subclass that implements the remaining method
class Tesla extends Car {
    // Implementing the remaining method
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("=== Interface Example ===");

        // Creating an object of Tesla class
        Tesla myCar = new Tesla();

        // Calling the implemented methods
        myCar.start();  // Method from Car (which was abstract)
        myCar.stop();   // Method implemented in Tesla
    }
}
