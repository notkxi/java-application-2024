/**
 * This program processes data from an input file named "babynames.txt" that contains
 * information about baby names, their popularity, and gender.
 *
 * @author Kai Ibarrondo
 * @RUID kai51
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            // Open the input file for reading
            File inputFile = new File("babynames.txt");
            Scanner in = new Scanner(inputFile);

            // Create output files for boys' and girls' names
            PrintWriter boynames = new PrintWriter("boynames.txt");
            PrintWriter girlnames = new PrintWriter("girlnames.txt");

            // Variables to store total baby count
            int babytotal = 0;

            // Read each line from the input file
            while (in.hasNextLine()) {
                // Split each line into tokens using whitespace as delimiter
                String line = in.nextLine();
                String[] tokens = line.split("\\s+");

                // Extract information for boys
                String boyName = tokens[1];
                int boyCount = Integer.parseInt(tokens[2]);

                // Extract information for girls
                String girlName = tokens[4];
                int girlCount = Integer.parseInt(tokens[5]);

                // Write boys' and girls' names to respective output files
                boynames.println(boyName);
                girlnames.println(girlName);

                // Update total baby count
                babytotal += boyCount + girlCount;
            }

            // Print total baby count to the console
            System.out.println("Total number of babies born: " + babytotal);

            // Close the input and output files
            in.close();
            boynames.close();
            girlnames.close();

        } catch (FileNotFoundException error) {
            // Handle file not found exception
            error.printStackTrace();
            System.out.println(error.getMessage());
        }
    }
}