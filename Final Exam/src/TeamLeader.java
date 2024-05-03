import java.time.LocalDate;

public class TeamLeader extends ProductionWorker {
    private double monthly_bonus;
    private int required_training;
    private int attended_training;
    public TeamLeader(String name, String employ_num, LocalDate hire_date,
                      int shift, double hour_pay, double monthly_bonus,
                      int required_training, int attended_training) throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate {
        super(name, employ_num, hire_date, shift, hour_pay);
        this.monthly_bonus = monthly_bonus;
        this.required_training = required_training;
        this.attended_training = attended_training;
    }
    public double getMonthly_bonus() {
        return monthly_bonus;
    }

    public void setMonthly_bonus(double monthly_bonus) {
        this.monthly_bonus = monthly_bonus;
    }

    public int getRequired_training() {
        return required_training;
    }

    public void setRequired_training(int required_training) {
        this.required_training = required_training;
    }

    public int getAttended_training() {
        return attended_training;
    }

    public void setAttended_training(int attended_training) {
        this.attended_training = attended_training;
    }
}
