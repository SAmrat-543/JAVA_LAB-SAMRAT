package LAB1_2;
import java.util.Scanner;

public class LAB1_Q5 {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5.Write both procedural and object oriented programs to calculate the area of a \n a) Circle b) Square c) Rectangle d) Sphere ");
        System.out.println("\n#### Procedural Approach ####");
        System.out.print("*** Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double circleArea = calculateCircleArea(radius);
        System.out.println("Area of the Circle using procesural method: " + circleArea);

        System.out.print("*** Enter the side of the square: ");
        double side = sc.nextDouble();
        double squareArea = calculateSquareArea(side);
        System.out.println("Area of the Square using procesural method: " + squareArea);

        System.out.print("*** Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("*** Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        double rectangleArea = calculateRectangleArea(length, width);
        System.out.println("Area of the Rectangle using procesural method: " + rectangleArea);
        System.out.print("*** Enter the radius of the sphere: ");
        radius = sc.nextDouble();
        double sphereArea = calculateSphereArea(radius);
        System.out.println("Area of the Sphere using procesural method: " + sphereArea);

        System.out.println("\n--- Object-Oriented Approach ---");
        System.out.print("@@@ Enter the radius of the circle: ");
        double radiusNew = sc.nextDouble();
        ObjectOriented object = new ObjectOriented();
        ObjectOriented.Circle circle = object.new Circle(radiusNew);
        System.out.println("Area of the Circle: " + circle.getArea());

        System.out.print("@@@ Enter the side of the square: ");
        double sideNew = sc.nextDouble();
        ObjectOriented.Square square = object.new Square(sideNew);
        System.out.println("Area of the Square: " + square.getArea());

        System.out.print("@@@ Enter the length of the rectangle: ");
        double lengthNew = sc.nextDouble();
        System.out.print("@@@ Enter the width of the rectangle: ");
        double widthNew = sc.nextDouble();
        ObjectOriented.Rectangle rectangle = object.new Rectangle(lengthNew, widthNew);
        System.out.println("Area of the Rectangle: " + rectangle.getArea());

        System.out.print("@@@ Enter the radius of the sphere: ");
        double radiusNewForSphere = sc.nextDouble();
        ObjectOriented.Sphere sphere = object.new Sphere(radiusNewForSphere);
        System.out.println("Area of the Sphere: " + sphere.getArea());
        sc.close();
    }
}

class ObjectOriented{
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
