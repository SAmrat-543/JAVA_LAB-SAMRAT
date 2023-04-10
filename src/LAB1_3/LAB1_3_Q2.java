package LAB1_3;

public class LAB1_3_Q2 {
    public static void main(String[] args) {
        //TryCatchFinallyExample
        System.out.println("### 2.Write a program to demonstrate try-finally.");
        try {
            System.out.println("Try Block executed");
            // Code that may throw an exception
            //int result = 10 / 0 ; // This will throw an ArithmeticException
            // System.out.println("Result: " + result); // This line will not be executed as it is commented out
        } 
       
        finally {
            // Finally block to execute regardless of whether an exception occurred or not
            System.out.println("Finally block executed.");
        }
    }
}
