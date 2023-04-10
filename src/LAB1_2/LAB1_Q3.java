package LAB1_2;
import java.util.Scanner;
public class LAB1_Q3 {
    //static method
    public static double addNumbers(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("3.Write a program to input and add two numbers using static methods (procedural programming).");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = addNumbers(num1, num2);
        System.out.println("The sum of the two numbers is: " + result);
        scanner.close();
    }
}