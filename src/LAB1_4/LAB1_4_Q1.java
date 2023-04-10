package LAB1_4;
import java.io.*;

public class LAB1_4_Q1 {
    public static void main(String[] args) {
        // FileIOExample
        System.out.println("## 1. Write the simple java program that reads data from one file and writes data to another file. ");
        String inputFile = "src/LAB1_4/Files/input.txt"; // Input file name
        String outputFile = "src/LAB1_4/Files/output.txt"; // Output file name

        try {
            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write("Copied Data: ");
            writer.newLine();
            String line;
            // Read data from input file and write to output file line by line
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a new line after each line
            }

            // Close the input and output file
            reader.close();
            writer.close();

            System.out.println("Data has been successfully copied from " + inputFile + " to " + outputFile);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
