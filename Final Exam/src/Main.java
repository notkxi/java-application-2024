import java.time.LocalDate;
import java.time.Month;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InvalidShift, InvalidEmployeeNumber, InvalidPayRate {
        ProductionWorker worker = new ProductionWorker("Kai Ibarrondo", "123-A", LocalDate.of(1999, Month.FEBRUARY, 1), 1, 15.00);
        ProductionWorkerDemo(worker);

        ShiftSupervisor supervisor = new ShiftSupervisor("Jack Sparrow", "456-B", LocalDate.of(2000, Month.MARCH, 15), 50000.0, 5000.0);
        ShiftSupervisorDemo(supervisor);

        TeamLeader leader = new TeamLeader("Davy Jones", "789-C", LocalDate.of(2005, Month.APRIL, 15), 1, 20.00, 500.0, 40, 35);
        TeamLeaderDemo(leader);

        //Employee invalid_employee = new Employee("Jon Lamonthe", "123-1", LocalDate.of(1999, Month.FEBRUARY, 1));

        //ProductionWorker invalid_worker = new ProductionWorker("Kai Ibarrondo", "123-A", LocalDate.of(1999, Month.FEBRUARY, 1), 2, -4);

    }
    public static void ProductionWorkerDemo(ProductionWorker worker){
        // Display information
        System.out.println("\nEmployee Name: " + worker.getName());
        System.out.println("Employee Number: " + worker.getEmploy_num());
        System.out.println("Hire Date: " + worker.getHire_date());
        System.out.println("Shift: " + worker.getShift());
        System.out.println("Hourly Pay Rate: $" + worker.getHour_pay());
    }
    public static void ShiftSupervisorDemo(ShiftSupervisor supervisor) {
        System.out.println("\nSupervisor Name: " + supervisor.getName());
        System.out.println("Employee Number: " + supervisor.getEmploy_num());
        System.out.println("Hire Date: " + supervisor.getHire_date());
        System.out.println("Annual Salary: $" + supervisor.getAnnual_salary());
        System.out.println("Annual Production Bonus: $" + supervisor.getAnnual_bonus());
    }

    public static void TeamLeaderDemo(TeamLeader leader) {
        // Display information
        System.out.println("\nLeader Name: " + leader.getName());
        System.out.println("Employee Number: " + leader.getEmploy_num());
        System.out.println("Hire Date: " + leader.getHire_date());
        System.out.println("Shift: " + leader.getShift());
        System.out.println("Hourly Pay Rate: $" + leader.getHour_pay());
        System.out.println("Monthly Bonus: $" + leader.getMonthly_bonus());
        System.out.println("Required Training Hours: " + leader.getRequired_training());
        System.out.println("Attended Training Hours: " + leader.getAttended_training());
    }
}