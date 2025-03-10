// Outer class containing a protected interface
class OuterClass {
    // Protected Nested Interface (ONLY accessible within subclasses)
    protected interface Vehicle {
        int WHEELS = 4;  // Constant field
        String TYPE = "Car";  // Constant field

        void start();  // Abstract method
    }
}

// Class implementing the protected interface
class Car implements OuterClass.Vehicle {
    // Implementing the method from the interface
    public void start() {
        System.out.println("Car is starting...");
    }
}

// Main class
public class ProtectedInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== Protected Interface Example ===");

        // Creating an object of Car class
        Car myCar = new Car();

        // Printing interface field values
        System.out.println("Vehicle Type: " + OuterClass.Vehicle.TYPE);
        System.out.println("Number of Wheels: " + OuterClass.Vehicle.WHEELS);

        // Calling the implemented method
        myCar.start();
    }
}
