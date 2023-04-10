package LAB1_2;
// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes sound.");
    }
}

// Child class 1
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

// Child class 3
class Lion extends Animal {
    void makeSound() {
        System.out.println("Lion Roars.");
    }
}

public class LAB1_Q11  {
    //PolymorphismExample
    public static void main(String[] args) {
        System.out.println("##11. Write a program to demonstrate polymorphism using non-abstract class as parent.");

        // Creating objects of different classes
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Lion();
        
        // Calling the overridden method makeSound() on different objects
        animal1.makeSound(); // Output: Dog barks.
        animal2.makeSound(); // Output: Cat meows.
        animal3.makeSound(); // Output: Lion Roars.
    }
}
