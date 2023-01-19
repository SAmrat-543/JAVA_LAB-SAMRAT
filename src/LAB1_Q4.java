import java.util.Scanner;

public class LAB1_Q4 {
    public static double calculateSimpleInterest(double principle, double time, double rate) {
        return (principle * time * rate) / 100;
    }
    public static void main(String[] args) {
        System.out.println("4. Write a program to input principle, time and rate, then calculate simple interest using static methods. ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        double principle = sc.nextDouble();
        System.out.print("Enter time in years: ");
        double time = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        
        double interest = calculateSimpleInterest(principle, time, rate);
        System.out.println("Simple Interest: " + interest);
        sc.close();
    }
    
}
