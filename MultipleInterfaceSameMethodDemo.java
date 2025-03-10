// First interface with a method
interface Animal {
    void makeSound();  // Method with the same signature
}

// Second interface with the same method
interface Bird {
    void makeSound();  // Method with the same signature
}

// Class implementing both interfaces
class Sparrow implements Animal, Bird {
    // Single implementation for both interfaces
    public void makeSound() {
        System.out.println("Sparrow chirps: Chirp! Chirp!");
    }
}

// Main class
public class MultipleInterfaceSameMethodDemo {
    public static void main(String[] args) {
        System.out.println("=== Multiple Interfaces with Same Method ===");

        // Creating an object of Sparrow class
        Sparrow mySparrow = new Sparrow();

        // Calling the method (same for both interfaces)
        mySparrow.makeSound();
    }
}
