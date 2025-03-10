// First interface
interface Animal {
    void makeSound();  // Abstract method
}

// Second interface
interface Movement {
    void move();  // Abstract method
}

// Class implementing both interfaces
class Dog implements Animal, Movement {
    // Implementing makeSound() from Animal interface
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    // Implementing move() from Movement interface
    public void move() {
        System.out.println("Dog is running...");
    }
}

// Main class
public class MultipleInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== Multiple Interfaces Example ===");

        // Creating an object of Dog class
        Dog myDog = new Dog();

        // Calling methods from both interfaces
        myDog.makeSound();  // Method from Animal interface
        myDog.move();       // Method from Movement interface
    }
}
