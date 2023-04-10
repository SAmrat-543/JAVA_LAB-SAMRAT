package LAB1_2;
// Abstract parent class
abstract class Animals {
    public abstract void makeSound(); 
}

// Child class 1
class Dogs extends Animals {
    public void makeSound() { 
        System.out.println("Dog barks.");
    }
}

// Child class 2
class Cats extends Animals {
    public void makeSound() { 
        System.out.println("Cat meows.");
    }
}

public class LAB1_Q12 {
    public static void main(String[] args) {
        // PolymorphismExample using abstract class
        System.out.println("### 12. Write a program to demonstrate polymorphism using abstract class as parent.");
        // Creating objects of different classes
        Animals animal1 = new Dogs();
        Animals animal2 = new Cats();
        // Calling the overridden method makeSound() on different objects
        animal1.makeSound(); // Output: Dog barks.
        animal2.makeSound(); // Output: Cat meows.
    }
}
