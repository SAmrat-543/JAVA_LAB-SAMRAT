package LAB1_2;
import java.util.Scanner;
public class LAB1_Q1 {
    public static int balanced(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (i % 2 == 0) { //at even index
            if (arr[i] % 2 != 0) { // not even , returns 0
                return 0;
            }
        } else {
            if (arr[i] % 2 == 0) { //at odd index , is even, returns 0
                return 0;
            }
        }
    }
    return 1; // is balanced otherwise
}

    public static void main(String[] args) throws Exception {
        System.out.println("1. An array is called balanced if it's even numbered elements (a[0], a[2], etc.) are even and its odd numbered elements (a[1], a[3], etc.) are odd. Write a function named balanced that accepts an array of integers which returns 1 if the array is balanced and returns 0 otherwise.");
        Scanner in = new Scanner(System.in);
        int size = 0;
        
        System.out.print("Enter the size of the array : ");
        size = in.nextInt();
        int[] arr= new int[size];

        System.out.println("Enter Array Elements:");
        for(int i =0 ;i< size; i++){
            System.out.print("a["+i+"] = ");
            arr[i]= in.nextInt();
        }
        
        if(balanced(arr)== 1){
            System.out.println("*** The Array is Balanced. ***");
        }
        else if(balanced(arr)== 0){
            System.out.println("!!! The Array is not Balanced. !!!");
        }
        in.close();
    }
}
