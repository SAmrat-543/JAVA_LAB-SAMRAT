package Unresolved;
import java.util.Scanner;

public class LAB1_Q5New{

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateSquareArea(double side) {
        return Math.pow(side, 2);
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateSphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }


public class ObjectOriented {
    public class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    public class Square {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        public double getArea() {
            return Math.pow(side, 2);
        }
    }

    public class Rectangle {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getArea() {
            return length * width;
        }
    }

    public class Sphere {
        private double radius;

        public Sphere(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return 4 * Math.PI * Math.pow(radius, 2);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5.Write both procedural and object oriented programs to calculate the area of a /na) Circle b) Square c) Rectangle d) Sphere ");
        System.out.println("#### Procedural Approach ####");
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double circleArea = LAB1_Q5New.calculateCircleArea(radius);
        System.out.println("Area of the Circle using procesural method: " + circleArea);

        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();
        double squareArea = LAB1_Q5New.calculateSquareArea(side);
        System.out.println("Area of the Square using procesural method: " + squareArea);

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        double rectangleArea = LAB1_Q5New.calculateRectangleArea(length, width);
        System.out.println("Area of the Rectangle using procesural method: " + rectangleArea);

        System.out.print("Enter the radius of the sphere: ");
        radius = sc.nextDouble();
        double sphereArea = LAB1_Q5New.calculateSphereArea(radius);
        System.out.println("Area of the Sphere using procesural method: " + sphereArea);

        System.out.println("#### Object-Oriented Approach ####");
        System.out.print("Enter the radius of the circle: ");
        double radiusNew = sc.nextDouble();
        ObjectOriented objectOriented = new ObjectOriented();
        ObjectOriented.Circle circle = objectOriented.new Circle(radiusNew);
        System.out.println("Area of the Circle: " + circle.getArea());

        System.out.print("Enter the side of the square: ");
        double sideNew = sc.nextDouble();
        ObjectOriented.Square square = objectOriented.new Square(sideNew);
        System.out.println("Area of the Square: " + square.getArea());

        System.out.print("Enter the length of the rectangle: ");
        double lengthNew = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double widthNew = sc.nextDouble();
        ObjectOriented.Rectangle rectangle = objectOriented.new Rectangle(lengthNew, widthNew);
        System.out.println("Area of the Rectangle: " + rectangle.getArea());

        System.out.print("Enter the radius of the sphere: ");
        double radiusNewForSphere = sc.nextDouble();
        ObjectOriented.Sphere sphere = objectOriented.new Sphere(radiusNewForSphere);
        System.out.println("Area of the Sphere: " + sphere.getArea());
    }
}
}

