// Defining an interface with one method
interface Greeting {
    void sayHello(); // Abstract method (no body)
}

// Class implementing the interface
class HelloWorld implements Greeting {
    // Implementing the interface method
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== Interface Example ===");

        // Creating an object of HelloWorld class
        HelloWorld obj = new HelloWorld();

        // Calling the implemented method
        obj.sayHello();
    }
}
