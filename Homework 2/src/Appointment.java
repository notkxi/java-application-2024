public class Appointment
{
    /* Variables to store the day, month, year, and description. */
    private int d;
    private int m;
    private int y;
    private String desc;
    /* Constructor to create an appointment with the specified day, month, year, and description. */
    public Appointment(int a, int b, int c, String description) {
        d = a;
        m = b;
        y = c;
        desc = description;
    }
    /* Method to check if entered appointment occurs on same day, month, and year as another appointment. */
    public boolean occursOn(int inputd, int inputm, int inputy) {
        return d == inputd && m == inputm && y == inputy;
    }

    /* Getter methods to access private attributes. */
    public int getDay() {
        return d;
    }

    public int getMonth() {
        return m;
    }

    public int getYear() {
        return y;
    }

    public String getDesc() {
        return desc;
    }
}
