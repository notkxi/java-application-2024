/* Class for an appointment that occurs one time. */
public class Onetime extends Appointment
{
    /* Call the superclass constructor to initialize the attributes. */
    public Onetime(int day, int month, int year, String description) {
        super(day, month, year, description);
    }
    /* Method override to check if entered appointment occurs on same day, month, and year as another appointment. */
    public boolean occursOn(int inputd, int inputm, int inputy) {
        return getDay() == inputd && getMonth() == inputm && getYear() == inputy;
    }
}
