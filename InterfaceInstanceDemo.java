// Defining an interface with one method
interface Greeting {
    void sayHello();  // Abstract method (must be implemented)
}

// Class implementing the interface
class HelloWorld implements Greeting {
    // Implementing the interface method
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

// Main class
public class InterfaceInstanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Interface Example ===");

        // Creating an instance of HelloWorld using interface reference
        Greeting obj = new HelloWorld();  // Polymorphism

        // Calling the implemented method using the interface reference
        obj.sayHello();
    }
}
