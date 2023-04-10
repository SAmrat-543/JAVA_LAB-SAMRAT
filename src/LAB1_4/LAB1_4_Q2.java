package LAB1_4;

import java.io.*;

public class LAB1_4_Q2 {
    public static void main(String[] args) {
        //DuplicateCharacter
        System.out.println("## 2. Write a program to duplicate each character in a text file and write the output in a separate file using character stream.\n  e.g.  source.txt  => apple  \n   destination.txt => aappppllee ");
        String inputFile = "src/LAB1_4/Files/source.txt"; // Input file name
        String outputFile = "src/LAB1_4/Files/destination.txt"; // Output file name
        try {
            // Open the input file for reading
            FileReader reader = new FileReader(inputFile);

            // Open the output file for writing
            FileWriter writer = new FileWriter(outputFile);
            writer.write("Modified Data:");
            writer.write("\n");
            int c;
            // Read data from input file character by character
            while ((c = reader.read()) != -1) {
                char character = (char) c;
                // Duplicate each character and write to output file
                writer.write(character);
                writer.write(character);
            }

            // Close the input and output file
            reader.close();
            writer.close();

            System.out.println("Characters have been successfully duplicated from " + inputFile + " to " + outputFile);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
