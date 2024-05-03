/**
 * Arithmetic Learning Game
 *
 * This program is designed to teach arithmetic to young children through a game format.
 * The game includes three levels, each focusing on specific math skills.
 *
 * Level 1: Tests addition of numbers less than 10, with a sum less than 10.
 * Level 2: Tests addition of arbitrary one-digit numbers (sum could be more than 10).
 * Level 3: Tests subtraction of one-digit numbers with a non-negative difference.
 *
 * Players start at Level 1 and progress by achieving a score of five points per level.
 * They have up to two tries per problem. The game aims to make learning math fun and engaging.
 *
 * @author Kai Ibarrondo
 * @RUID kai51
 */

// The main class for the game
public class Demo {

    // The main method where the program execution starts
    public static void main(String[] args) {
        // Display the entry message for the game
        Messages.displayEntryMessage();

        // Run Level 1
        if(One.runLevel() == 0){
            Messages.displayFailureMessage();
            System.exit(0);
        }
        // Run Level 2
        if(Two.runLevel() == 0){
            Messages.displayFailureMessage();
            System.exit(0);
        }
        // Run Level 3
        if(Three.runLevel() == 0){
            Messages.displayFailureMessage();
            System.exit(0);
        }
        // Print exit message
        else{
            // Display the exit message for the game
            Messages.displayExitMessage();
        }
    }
}
