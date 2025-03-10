// Parent Interface
interface Animal {
    void eat();  // Abstract method
}

// Child Interface that extends Animal
interface Dog extends Animal {
    void bark();  // Abstract method
}

// Class implementing the child interface
class Labrador implements Dog {
    // Implementing the method from Animal interface
    public void eat() {
        System.out.println("Labrador is eating...");
    }

    // Implementing the method from Dog interface
    public void bark() {
        System.out.println("Labrador barks: Woof! Woof!");
    }
}

// Main class
public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Interface Inheritance Example ===");

        // Creating an object of Labrador class
        Labrador myDog = new Labrador();

        // Calling the implemented methods
        myDog.eat();  // Method from Animal interface
        myDog.bark(); // Method from Dog interface
    }
}
