/* Class for an appointment that occurs one monthly. */
public class Monthly extends Appointment
{
    /* Call the superclass constructor to initialize the attributes. */
    public Monthly(int day, int month, int year, String description) {
        super(day, month, year, description);
    }
    /* Method override to check if entered appointment occurs on same month as another appointment. */
    public boolean occursOn(int inputd, int inputm, int inputy) {
        return inputm == getMonth();
    }
}

