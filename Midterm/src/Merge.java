import java.util.ArrayList;

public class Merge {
    // Method to merge or add a new baby name to the totalBabyNames ArrayList
    static void merge(ArrayList<Baby> totalBabyNames, Baby currentBaby) {
        for (Baby baby : totalBabyNames) {
            if (baby != null && baby.getName().equals(currentBaby.getName())) {
                // Merge counts for babies with the same name
                baby.merge(currentBaby);
                return;
            }
        }
        // If no matching name is found, add the new baby to the ArrayList
        totalBabyNames.add(currentBaby);
    }
}
