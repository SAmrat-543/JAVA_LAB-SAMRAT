package LAB1_2.LAB1_Q14;

public class Circle {
    private double radius; // field to store radius
    
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate and return area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Method to display circle details
    public void display() {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Area of circle: " + calculateArea());
    }
}

