import java.time.LocalDate;

public class ProductionWorker extends Employee {
    private int shift;
    private double hour_pay;

    public ProductionWorker(String name, String employ_num, LocalDate hire_date, int shift, double hour_pay) throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate {
        super(name, employ_num, hire_date);
        if(isValidShift(shift)) {
            this.shift = shift;
        }
        else {
            throw new InvalidShift("Invalid shift: " + shift);
        }
        if(isValidRate(hour_pay)){
            this.hour_pay = hour_pay;
        }
        else{
            throw new InvalidPayRate("Invalid pay: " + hour_pay);
        }
    }
    public String getShift() {
        return (shift == 1) ? "Day" : "Night";
    }

    public void setShift(int shift) throws InvalidShift {
        if(isValidShift(shift)) {
            this.shift = shift;
        }
        else{
            throw new InvalidShift("Invalid shift: " + shift);
        }

    }

    public double getHour_pay() {
        return hour_pay;
    }

    public void setHour_pay(double hour_pay) {
        this.hour_pay = hour_pay;
    }

    private boolean isValidShift(int shift){
        return shift == 1 || shift == 2;
    }

    private boolean isValidRate(double pay){
        return pay >= 0.00;
    }
}
