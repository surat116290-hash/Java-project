//Q10/Surat Bista /116290
public class ATMSimulation {
    private double balance;

    //Constructor to initialize the account balance
    public ATMSimulation (double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0; //Preventing negative starting balance
        }
    }
    //using getter method to read private balance
    public double getBalance() {
        return this.balance;
    }
    //setter logic for depositing money securely
    public void deposit (double amt) {
        if (amt > 0) {
            this.balance = amt;
        }
    }
    //withdraw method
    public void withdraw (double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
        }
    }
}