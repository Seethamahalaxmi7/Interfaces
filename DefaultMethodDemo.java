// Interface with a default method
interface Vehicle {
    // Default method with implementation
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Class implementing the interface but NOT overriding the default method
class Car implements Vehicle {
    // No need to implement 'start()' because it's a default method
}

// Main class
public class DefaultMethodDemo {
    public static void main(String[] args) {
        System.out.println("=== Default Method Example ===");

        // Creating an object of Car class
        Car myCar = new Car();

        // Calling the default method (from interface)
        myCar.start();
    }
}
