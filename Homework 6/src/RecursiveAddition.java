public class RecursiveAddition {
    // Method to recursively add all integers in the array
    public static int add(int[] array, int index) {
        // Base case: If the index is out of bounds, return 0
        if (index < 0 || index >= array.length) {
            return 0;
        } else {
            // Recursive case:
            // Add the current element to the sum and recursively call add with the next index
            return array[index] + add(array, index + 1);
        }
    }
}
