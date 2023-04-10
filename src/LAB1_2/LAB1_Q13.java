package LAB1_2;
// Parent interface    
interface Mammal {
    public void makeSound(); // Method signature
}

// Child class 1
class Dog1 implements Mammal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Child class 2
class Cat1 implements Mammal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class LAB1_Q13 {

    public static void main(String[] args) {
        //PolymorphismExample using interface
        System.out.println("## 13. Write a program to demonstrate polymorphism using interface as parent. ");
        // Creating objects of different classes
        Mammal animal1 = new Dog1();
        Mammal animal2 = new Cat1();
        
        // Calling the method makeSound() on different objects
        animal1.makeSound(); // Output: Dog barks.
        animal2.makeSound(); // Output: Cat meows.
    }
}
