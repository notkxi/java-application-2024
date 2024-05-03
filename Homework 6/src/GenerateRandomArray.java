import java.util.Random;

public class GenerateRandomArray {
    // Method to generate an array of random integers
    public static int[] generate(int n) {
        // Create an array to store the random integers
        int[] array = new int[n];

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Loop to generate 'n' random integers and add them to the array
        for (int i = 0; i < n; i++) {
            // Generate a random integer between 0 (inclusive) and 100 (exclusive)
            int randomNumber = random.nextInt(100);

            // Assign the generated random integer to the array
            array[i] = randomNumber;
        }

        // Return the generated array of random integers
        return array;
    }
}
