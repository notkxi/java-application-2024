import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ArrayLists to store total baby names for boys and girls
        ArrayList<Baby> totalBoyNames = new ArrayList<>();
        ArrayList<Baby> totalGirlNames = new ArrayList<>();

        try {
            // Loop through the years from 1990 to 2017
            for (int year = 1990; year <= 2017; year++) {
                // Open the input file for reading
                File inputFile = new File("names" + year + ".csv");
                Scanner in = new Scanner(inputFile);

                // Declare and initialize arrays for boys and girls
                Baby[] boyArray = new Baby[1000];
                Baby[] girlArray = new Baby[1000];

                int i = 0;
                int j = 0;

                // Read each line from the input file
                while (in.hasNextLine()) {
                    // Split each line into tokens using a comma as a delimiter
                    String line = in.nextLine();
                    String[] tokens = line.split(",");

                    // Extract information for boys and girls
                    Baby currentBoy = new Baby(tokens[1], Integer.parseInt(tokens[0]), Integer.parseInt(tokens[2]));
                    Baby currentGirl = new Baby(tokens[3], Integer.parseInt(tokens[0]), Integer.parseInt(tokens[4]));

                    // Populate arrays and update total names
                    boyArray[i++] = currentBoy;
                    girlArray[j++] = currentGirl;

                    Merge.merge(totalBoyNames, currentBoy);
                    Merge.merge(totalGirlNames, currentGirl);
                }

                // Close the input file
                in.close();

                // Sort arrays after reading all the data for the current year
                Arrays.sort(boyArray);
                Arrays.sort(girlArray);

                // Print information for the current year
                Printer.header("Boy", year);
                Printer.printbabyarray(boyArray);
                Printer.header("Girl", year);
                Printer.printbabyarray(girlArray);
            }

            // Sort total names for boys and girls
            Collections.sort(totalBoyNames);
            Collections.sort(totalGirlNames);

            // Print all-time information for boys and girls
            Printer.headertotal("Boy");
            Printer.printbabylist(totalBoyNames);
            Printer.headertotal("Girl");
            Printer.printbabylist(totalGirlNames);

        } catch (FileNotFoundException error) {
            // Handle file not found exception
            error.printStackTrace();
            System.out.println(error.getMessage());
        }
    }
}
