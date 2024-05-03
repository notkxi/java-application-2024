/* Class for an appointment that occurs daily. */
public class Daily extends Appointment
{
    /* Call the superclass constructor to initialize the attributes. */
    public Daily(int day, int month, int year, String description) {
        super(day, month, year, description);
    }
    /* Method override to check if entered appointment occurs on same day as another appointment. */
    public boolean occursOn(int inputd, int inputm, int inputy) {
        return inputd == getDay();
    }
}

