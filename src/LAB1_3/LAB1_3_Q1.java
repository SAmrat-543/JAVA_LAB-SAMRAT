package LAB1_3;
public class LAB1_3_Q1{

    public static void main(String[] args) {
        //TryCatchFinallyExample
        System.out.println("### 1.Write a program to demonstrate try-catch-finally.");
        try {
            // Code that may throw an exception
            int dividend = 10;
            int divisor = 0;
            int result = dividend / divisor; // This will throw an ArithmeticException
            System.out.println("Result: " + result); // This line will not be executed
        } 
        catch (ArithmeticException ex) {
            // Catch block to handle the specific exception
            System.out.println("Exception occurred: " + ex.getMessage());
        } 
        finally {
            // Finally block to execute regardless of whether an exception occurred or not
            System.out.println("Finally block executed.");
        }
    }
}
