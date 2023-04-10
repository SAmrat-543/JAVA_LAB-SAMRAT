package LAB1_2.LAB1_Q14;

import LAB1_2.LAB1_Q14.Circle;
import LAB1_2.LAB1_Q14.Square;

public class ShapeDemo {
    public static void main(String[] args) {
        System.out.println("## 14. Write a program to create two classes Circle and Square, with appropriate fields and methods, in a package name shape. Create a separate class ShapeDemo to test the classes.");
        // Create objects of Circle and Square classes
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        
        // Display details of circle and square
        System.out.println("Circle details:");
        circle.display();
        System.out.println("\nSquare details:");
        square.display();
    }
}
