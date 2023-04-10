package LAB1_4;
import java.io.*;

public class LAB1_4_Q5 {
    public static void main(String[] args) {
        String outputFile = "src/LAB1_4/Files/outputFile.txt"; // Output file name
        //InputToFileExample
        System.out.println("## 5.Write a program to input whole lines from the keyboard and write them to a file. Exit the program when the user types “quit”.");
        try {
            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            System.out.println("Enter lines to write to file (type 'quit' to exit):");
            writer.write("User Input Data:");
            writer.newLine();
            // Read lines from keyboard input
            while (!(line = reader.readLine()).equals("quit")) {
                // Write the line to the output file
                writer.write(line);
                writer.newLine(); // Add a new line after each line
            }

            // Close the output file and keyboard input reader
            writer.close();
            reader.close();
            System.out.println("Lines have been written to " + outputFile);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
