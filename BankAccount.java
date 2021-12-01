

public class BankAccount{

    double checkingBalance;
    double savingsBalance;
    static int numberOfAccounts = 0;
    static double accountsTotal = 0;


    public BankAccount(){
        numberOfAccounts++;
    }

    //  getters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }



}