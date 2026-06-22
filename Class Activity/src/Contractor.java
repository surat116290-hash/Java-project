//Q15 /Surat Bista /116290
public class Contractor extends Employee {
    double hourlyRate;
    int hoursWorked;

    // Constructor to set name, rate, and hours
    public Contractor(String name, double hourlyRate, int hoursWorked) {
        super(name); // Sends the name to the parent Employee class
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}