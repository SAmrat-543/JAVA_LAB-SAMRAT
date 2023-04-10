package LAB1_4;
import java.io.*;

public class LAB1_4_Q3 {
    public static void main(String[] args) {
        //SimpleInterestCalculator 
        System.out.println("Write a program to read records from a text file which contains people’s name, principle, rate and time values. Calculate simple interest and write all the contents of the source file along with simple interest to destination file.");
        System.out.println("e.g. source.txt => John 10000 10.5 2.5  Jane 5000 9.25 5.0 \n   destination.txt => John 10000 10.5 2.5 2625.00  Jane 5000 9.25 5.0 2312.50");
        String inputFile = "src/LAB1_4/Files/source1.txt"; // Input file name
        String outputFile = "src/LAB1_4/Files/destination1.txt"; // Output file name

        try {
            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write("New Data with Simple Interest (Name P R T = I):");
            writer.newLine();
            String line;
            // Read data from input file line by line
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" "); // Split line into tokens

                // Extract data from tokens
                String name = tokens[0];
                double principal = Double.parseDouble(tokens[1]);
                double rate = Double.parseDouble(tokens[2]);
                double time = Double.parseDouble(tokens[3]);

                // Calculate simple interest
                double simpleInterest = (principal * rate * time) / 100;

                // Write the original line and simple interest to the output file
                writer.write(line);
                writer.write(" = " + String.format("%.2f", simpleInterest)); // Format simple interest to two decimal places
                writer.newLine(); // Add a new line after each line
            }

            // Close the input and output file
            reader.close();
            writer.close();

            System.out.println("Simple interest has been calculated and written to " + outputFile);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
