

public class BankAccount{

    double checkingBalance;
    double savingsBalance;
    static int numberOfAccounts = 0;
    static double accountsTotal = 0;


    public BankAccount(){
        numberOfAccounts++;
    }

    //  methods
    public void addDeposit(String account, double amount){
        if(account == "Savings"){
            savingsBalance += amount;
            accountsTotal += amount;
        }
        else if (account == "Checking"){
            checkingBalance += amount;
            accountsTotal += amount;
        }
        else{
            System.out.println("Voided transaction");
        }
    }

    //  getters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }



}