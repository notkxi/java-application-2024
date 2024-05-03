import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private String name;
    private String employ_num;
    private LocalDate hire_date;

    public Employee(String name, String employ_num, LocalDate hire_date) throws InvalidEmployeeNumber {
        if(isValidEmployeeNum(employ_num)){
            this.name = name;
            this.employ_num = employ_num;
            this.hire_date = hire_date;
        }
        else {
            throw new InvalidEmployeeNumber("Invalid employee number: " + employ_num);
        }
    }

    public String getEmploy_num() {
        return employ_num;
    }

    public void setEmploy_num(String employ_num) throws InvalidEmployeeNumber {
        if(isValidEmployeeNum(employ_num)){
            this.employ_num = employ_num;
        }
        else {
            throw new InvalidEmployeeNumber("Invalid employee number: " + employ_num);
        }
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected boolean isValidEmployeeNum(String employ_num){
        String regex = "^\\d{3}-[A-M]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(employ_num);
        return matcher.matches();
    }
}
