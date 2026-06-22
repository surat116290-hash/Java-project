//Q10/Surat Bista /116290
public class ATMFinal {
    public static void main(String[] args) {

        //Creating a bank account with balance
        ATMSimulation myAccount = new ATMSimulation(100.0);
        System.out.println("Starting Balance: $" + myAccount.getBalance());

        //Trying to withdraw a valid amount
        System.out.println("\nWithdrawing $40.0..");
        myAccount.withdraw(40.0);
        System.out.println("Current Balance: $" + myAccount.getBalance());

        //Trying to overdraw
        System.out.println("\nTrying to overdraw by $150.0..");
        myAccount.withdraw(150.0);
        System.out.println("Balance after failed overdraw: $" + myAccount.getBalance());

        //Trying to withdraw a negative amount
        System.out.println("\nTrying to withdraw a negative amount (-$20.0)..");
        myAccount.withdraw(-20.0);
        System.out.println("Balance after failed negative withdrawal: $" + myAccount.getBalance());
    }
}
