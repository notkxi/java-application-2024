public class Messages {

    // Method to display entry message for the game
    public static void displayEntryMessage() {
        System.out.println("Welcome to the Arithmetic Learning Game!");
        System.out.println("Let's have fun while learning math!");
        System.out.println("You will start at Level 1 and progress through a total of 3 levels.");
        System.out.println("Each level has different challenges to test your addition and subtraction skills.");
        System.out.println("You have up to two tries per problem. Achieve a score of five points to advance to the next level.");
        System.out.println("Let's get started!\n");
    }

    // Method to display a closing message for the game
    public static void displayExitMessage() {
        System.out.println("You have successfully completed all the levels of the Arithmetic Learning Game!");
        System.out.println("You've demonstrated excellent addition and subtraction skills.");
        System.out.println("Well done! Keep up the good work and continue practicing your math!");
    }

    // Method to display a failure message for the game
    public static void displayFailureMessage() {
        System.out.println("Sorry, you've failed two times in a row. Game over!");
        System.out.println("Better luck next time!");
    }
}
