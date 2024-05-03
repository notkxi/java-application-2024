import java.util.ArrayList;

public class Printer {

    // Method to print header for a specific year and gender
    public static void header(String gender, int year) {
        System.out.println("\n-----------------------");
        System.out.println(gender + "'s Names " + "Year: " + year);
        System.out.println("-----------------------");
    }

    // Method to print header for all-time data of a specific gender
    public static void headertotal(String gender) {
        System.out.println("\n-----------------------");
        System.out.println(gender + "'s Names " + "All Time");
        System.out.println("-----------------------");
    }

    // Method to print all baby names for a specific year
    public static void printbabyarray(Baby[] babyArray) {
        for (Baby baby : babyArray) {
            if (baby != null) {
                System.out.println(baby);
            }
        }
    }

    // Method to print all baby names for all-time
    public static void printbabylist(ArrayList<Baby> babyList) {
        for (Baby baby : babyList) {
            System.out.println(baby);
        }
    }
}
