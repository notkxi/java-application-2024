import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Query the user to enter the size of the array
        System.out.print("Enter integer number for the size of your array: ");
        int size = scanner.nextInt();

        // Generate an array of random integers based on the size provided
        int[] numbers = GenerateRandomArray.generate(size);

        // Print the generated array
        System.out.println("Random array: " + Arrays.toString(numbers));

        // Calculate the sum of the elements in the array
        int sum = RecursiveAddition.add(numbers, 0);

        // Print the sum of the elements in the array
        System.out.println("Sum of the array: " + sum);
    }
}

