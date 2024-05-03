import java.util.Scanner;

public class Logic {
    public static int runLevel(int mode) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables for level
        int score = 0;
        int correctAnswer = 0;
        String operation = " + ";

        // Continue the level until the player achieves a score of 5
        while (score < 5) {
            // Generate two random numbers between 0 and 9
            int num1 = Data.generateRandomNumber(9);
            int num2 = Data.generateRandomNumber(9);

            //Checking the level we are on
            if (mode == 1){
                while (num1 + num2 >= 10) {
                    num1 = Data.generateRandomNumber(9);
                    num2 = Data.generateRandomNumber(9);
                }
                correctAnswer = num1 + num2;
            }

            if (mode == 2){
                num1 = Data.generateRandomNumber(9);
                num2 = Data.generateRandomNumber(9);
                correctAnswer = num1 + num2;
            }

            if (mode == 3){
                while (num1 - num2 < 0) {
                    num1 = Data.generateRandomNumber(9);
                    num2 = Data.generateRandomNumber(9);
                }
                operation = " - ";
                correctAnswer = num1 - num2;
            }

            // Display the addition question to the user
            System.out.println("Level " + mode + ": " + "What is " + num1 + operation + num2 + "?");

            // Get the user's answer
            int userAnswer = scanner.nextInt();

            // Check if the user's answer is correct
            if (userAnswer == correctAnswer) {
                System.out.println("Correct! Well done!\n");
                score++;
            }

            else {
                // Inform the user that the first attempt was incorrect and prompt for a second try
                System.out.println("Incorrect. Try again.");
                userAnswer = scanner.nextInt();

                // Check if the user's second attempt is correct
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct on the second try. Good effort!\n");
                    score++;
                }

                else {
                    // Inform the user about the incorrect answer and provide the correct answer
                    System.out.println("Incorrect. The correct answer is " + correctAnswer);
                    return 0;
                }
            }
        }

        // Display a congratulatory message upon completing Level 1
        System.out.println("Congratulations! You've completed Level " + mode + "!\n");
        return 1;
    }
}


