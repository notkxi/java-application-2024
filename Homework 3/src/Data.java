public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects) {
      // Initialize sum and count variables to calculate the average
      double sum = 0;
      int count = 0;

      // Create a temporary BankAccount object for type checking
      BankAccount tempacc = new BankAccount();

      // Check if the first object in the array is an instance of BankAccount
      if (objects[0] instanceof BankAccount) {
         // Iterate through the Measurable objects
         for (Measurable obj : objects) {
            // Check if the BankAccount accepts the Measurable object
            if (((BankAccount) obj).Accept((Double) 1000.0)) {
               // Add the measure to the sum and increment the count
               sum += obj.getMeasure();
               count++;
            }
         }
         // Check if there are Measurable objects in the array before calculating the average
         if (objects.length > 0) {
            return sum / count; // Calculate and return the average
         } else {
            return 0; // Return 0 if the array is empty
         }
      }

      else {
         // If the objects are not of type BankAccount, calculate the average directly
         for (Measurable obj : objects) {
            sum += obj.getMeasure();
         }
         // Check if there are Measurable objects in the array before calculating the average
         if (objects.length > 0) {
            return sum / objects.length; // Calculate and return the average
         }
         else {
            return 0; // Return 0 if the array is empty
         }
      }
   }
}
