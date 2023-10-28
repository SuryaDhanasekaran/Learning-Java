// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class
public class polymorphism {
    public static void main(String[] args) {
        // Creating instances of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling makeSound method polymorphically
        myDog.makeSound();
        myCat.makeSound();
    }
}
