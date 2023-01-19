import java.util.Scanner;
public class LAB1_Q8 {
        public static int[][] sum(int[][] matrix1, int[][] matrix2) {
            int rows = matrix1.length;
            int cols = matrix1[0].length;
            int[][] result = new int[rows][cols];
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return result;
        }
        
        public static int[][] difference(int[][] matrix1, int[][] matrix2) {
            int rows = matrix1.length;
            int cols = matrix1[0].length;
            int[][] result = new int[rows][cols];
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return result;
        }
        
        public static int[][] product(int[][] matrix1, int[][] matrix2) {
            int rows = matrix1.length;
            int cols = matrix2[0].length;
            int[][] result = new int[rows][cols];
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int sum = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        sum += matrix1[i][k] * matrix2[k][j];
                    }
                    result[i][j] = sum;
                }
            }
            return result;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("8) Create a class with static methods to calculate the sum, difference and product of two matrices (represented by 2D arrays). The methods must return the resulting matrices.");
            System.out.print("Enter the size of 2 dimentional Matrices = ");
            int size = sc.nextInt();
            int[][] a = new int[size][size];
            int[][] b = new int[size][size];
            System.out.println("Enter values of Matrices :");
            System.out.println("\nFor Matrix a :");
            for(int i =0 ;i<size;i++){
                for(int j=0;j<size;j++){
                    System.out.print("a["+i+"]["+j+"] = ");
                    a[i][j]= sc.nextInt();
                }
            }
            System.out.println("\nFor Matrix b :");
            for(int i =0 ;i<size;i++){
                for(int j=0;j<size;j++){
                    System.out.print("b["+i+"]["+j+"] = ");
                    b[i][j]= sc.nextInt();
                }
            }

            System.out.println("\nSum of matrix a and matrix b is " );
            int[][] sumValue = sum(a,b);
            for(int i=0; i<size;i++){
                System.out.print("|");
                for (int j=0;j<size;j++){
                        System.out.print("  "+sumValue[i][j]);
                    }
                System.out.println("|");
            }
            System.out.println("\nDifference of matrix a and matrix b is " );
            int[][] diffValue = difference(a,b);
            for(int i=0; i<size;i++){
                System.out.print("|");
                for (int j=0;j<size;j++){
                        System.out.print("  "+diffValue[i][j]);
                    }
                System.out.println("|");
            }
            System.out.println("\nProduct of matrix a and matrix b is ");
            int[][] productValue = product(a,b);
            for(int i=0; i<size;i++){
                System.out.print("|");
                for (int j=0;j<size;j++){
                        System.out.print("  "+productValue[i][j]);
                    }
                System.out.println("|");
            }
            sc.close();
        }
    }
    

