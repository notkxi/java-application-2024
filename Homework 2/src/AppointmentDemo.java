/**
 * The Appointment class represents an appointment with a description and a date.
 * It is a superclass for various types of appointments, such as one-time, daily, and monthly appointments.
 *
 * @author Kai Ibarrondo
 */
import java.util.Scanner;
public class AppointmentDemo{

	public static void main(String[] args){
	    
		Appointment[] appointment = new Appointment[5];
        appointment[0]= new Onetime(25,12,2017," Root Canal");
        appointment[1]= new Monthly(25,12,2017," Teeth Cleaning");
        appointment[2]= new Daily(25,12,2017," Filling");
        appointment[3]= new Onetime(13,12,2017," Crown");
        appointment[4]= new Monthly(15,12,2017," Dentures");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the day of the appointment (1-31) ");
        int day = keyboard.nextInt();
        System.out.println("Please input the month of the appointment (1-12) ");
        int month = keyboard.nextInt();
        System.out.println("Please input the year of the appointment ");
        int year = keyboard.nextInt();
        System.out.println(day +" "+ month+" " + year);
            
            
        for (int i = 0; i < 5; i++){
            if (appointment[i].occursOn(day, month, year)){
		        System.out.println("You have a" + appointment[i].getDesc() + " appointment on: " + appointment[i].getDay()  + " "+ appointment[i].getMonth()+ " " + appointment[i].getYear());
            }
        }
	}
}
