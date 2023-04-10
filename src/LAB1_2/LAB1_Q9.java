package LAB1_2;
import java.util.Scanner;

public class LAB1_Q9 {
        public class Encapsulation{
        private String name="SAMRAT SUBEDI";
        private int age=23;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            } else {
                System.out.println("Age cannot be negative!");
            }
        }
    }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("9) Write a program to demonstrate encapsulation. ");
            LAB1_Q9.Encapsulation obj = new LAB1_Q9().new Encapsulation();
            System.out.println("Default Name: " + obj.getName());
            System.out.println("Default Age: " + obj.getAge());

            System.out.println("\n*** Set new Values ***");
            System.out.print("\nSet new Name : ");
            String newName = s.next();
            System.out.print("\nSet new Age : ");
            int newAge = s.nextInt();
            // setting values using setter method
                obj.setName(newName);
                obj.setAge(newAge);
            // getting values using getter method
            System.out.println("\n ### New Name: " + obj.getName());
            System.out.println(" ### New Age: " + obj.getAge());
            s.close();
        }
}