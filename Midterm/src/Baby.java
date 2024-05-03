import java.lang.Comparable;
import java.util.Objects;

// Baby class implements the Comparable interface for sorting based on name
public class Baby implements Comparable<Baby> {
    // Attributes to store baby name, rank, and count
    public String name;
    public int rank;
    public int count;

    // Constructor to initialize baby attributes
    public Baby(String babyName, int babyRank, int babyCount){
        name = babyName;
        rank = babyRank;
        count = babyCount;
    }

    // Getter method to retrieve baby name
    public String getName(){
        return name;
    }

    // Override toString method to provide a string representation of the baby
    @Override
    public String toString(){
        return(name + " : " + rank + " : " + count);
    }

    // Merge method to combine counts for babies with the same name
    public void merge(Baby other) {
        if (other != null && Objects.equals(this.name, other.name)) {
            this.count += other.count;
        }
    }

    // Override compareTo method for sorting based on baby name
    @Override
    public int compareTo(Baby other) {
        return this.name.compareTo(other.name);
    }
}
