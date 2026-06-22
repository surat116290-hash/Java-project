//Q15 /Surat Bista /116290
public class FullTime extends Employee {
    double monthlySalary;

    // Constructor to set name and salary
    public FullTime(String name, double monthlySalary) {
        super(name); // Sends the name to the parent Employee class
        this.monthlySalary = monthlySalary;
    }
    // Calculates pay
    @Override
    double calculatePay() {
        return monthlySalary;
    }
}