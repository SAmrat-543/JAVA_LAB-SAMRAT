package LAB2_3.LAB2_3_Q6;
import java.util.Scanner;
import LAB2_3.LAB2_3_Q6.LAB2_3__Q6_a;
import LAB2_3.LAB2_3_Q6.LAB2_3__Q6_b;
import LAB2_3.LAB2_3_Q6.LAB2_3__Q6_c;

public class LAB2_3__Q6 {
    public static void main(String[] args){
        System.out.println("## 6. Write a program to calculate simple interest using  \na) FlowLayout  \nb) GridLayout  \nc) GridBagLayout ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String layoutChoice = input.nextLine();
        switch (layoutChoice.toLowerCase()) {
            case "a":
                new LAB2_3__Q6_a();
                break;
            case "b":
                new LAB2_3__Q6_b();
                break;
            case "c":
                new LAB2_3__Q6_c();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                System.exit(0);
        }
        input.close();
    }
    
}
