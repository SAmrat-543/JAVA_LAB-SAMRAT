import java.util.Scanner;

public class LAB1_Q2 {
    //Rectangle 
        double width;
        double height;
        double area;
        double perimeter;
    
        public void calculateArea() {
            area = width * height;
        }
    
        public void calculatePerimeter() {
            perimeter = 2 * (width + height);
        }
        public static void main(String[] args) {
            System.out.println("2.Write an object oriented program to find area and perimeter of rectangle.");
            Scanner in = new Scanner(System.in);
            LAB1_Q2 rectangle = new LAB1_Q2(); // object instantiation
            System.out.print("Enter width of Rectangle:");
            rectangle.width = in.nextDouble();
            System.out.print("Enter height of Rectangle:");
            rectangle.height = in.nextDouble();

            rectangle.calculateArea();
            rectangle.calculatePerimeter();
            System.out.println("Area of rectangle: " + rectangle.area);
            System.out.println("Perimeter of rectangle: " + rectangle.perimeter);
            in.close();
        }
    }
