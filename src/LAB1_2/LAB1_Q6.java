package LAB1_2;
import java.util.Scanner;
public class LAB1_Q6 {
    public static int sumArray(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+= array[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("6) Write a static method to calculate the sum of a one dimensional array. ");
        System.out.print("Enter the size of the one dimentional Array = ");
        int size= sc.nextInt();
        System.out.println("Enter the array values :");
        int[] array = new int[size];
        for(int i =0 ; i<size; i++){
            System.out.print("a["+i+"] = ");
            array[i]= sc.nextInt();
        }
        System.out.println("The sum of Array is "+sumArray(array));
        sc.close();
    }
}
