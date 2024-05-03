import java.time.LocalDate;
public class ShiftSupervisor extends Employee {
    private double annual_salary;
    private double annual_bonus;

    public ShiftSupervisor(String name, String employ_num, LocalDate hire_date, double annual_salary, double annual_bonus) throws InvalidEmployeeNumber {
        super(name, employ_num, hire_date);
        this.annual_salary = annual_salary;
        this.annual_bonus = annual_bonus;
    }

    public double getAnnual_salary() {
        return annual_salary;
    }

    public void setAnnual_salary(double annual_salary) {
        this.annual_salary = annual_salary;
    }

    public double getAnnual_bonus() {
        return annual_bonus;
    }

    public void setAnnual_bonus(double annual_bonus) {
        this.annual_bonus = annual_bonus;
    }
}
