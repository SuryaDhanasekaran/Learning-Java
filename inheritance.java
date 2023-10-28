// Parent class or Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Child class or Subclass
class Dog extends Animal {
    // The Dog class inherits the eat() and sleep() methods from the Animal class.
    // It can also have additional methods or attributes specific to a dog.

    void bark() {
        System.out.println("Woof! Woof!");
    }
}

// Main class
public class inheritance {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();

        // Call methods inherited from the Animal class
        myDog.eat();
        myDog.sleep();

        // Call method specific to the Dog class
        myDog.bark();
    }
}
