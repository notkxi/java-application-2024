import java.util.Random;

// Class to provide data-related functionalities for the game
public class Data {

    // Method to generate a random number within a specified upper limit
    public static int generateRandomNumber(int upperLimit) {
        // Create a Random object to generate random numbers
        Random random = new Random();

        // Generate a random number between 1 and the specified upper limit (inclusive)
        return random.nextInt(upperLimit) + 1;
    }
}
