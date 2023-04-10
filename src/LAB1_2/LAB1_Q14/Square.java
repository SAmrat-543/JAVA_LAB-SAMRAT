package LAB1_2.LAB1_Q14;

public class Square {
    private double side; // field to store side length
    
    // Constructor
    public Square(double side) {
        this.side = side;
    }
    
    // Method to calculate and return area of the square
    public double calculateArea() {
        return side * side;
    }
    
    // Method to display square details
    public void display() {
        System.out.println("Square with side length: " + side);
        System.out.println("Area of square: " + calculateArea());
    }
}
