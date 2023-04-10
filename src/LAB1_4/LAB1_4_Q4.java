package LAB1_4;
import java.io.*;

public class LAB1_4_Q4{
    public static void main(String[] args) {
        //FileReadingExample
        System.out.println("## 4.Write a program to read the contents of a file one line at a time and output them to the screen.");
        String inputFile = "src/LAB1_4/Files/myFile.txt"; // Input file name

        try {
            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            String line;
            // Read data from input file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Output the line to the screen
            }

            // Close the input file
            reader.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
