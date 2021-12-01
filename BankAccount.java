

public class BankAccount{

    private double checkingBalance;
    private double savingsBalance;
    private int accountNumber;
    private static int numberOfAccounts = 0;
    private static double accountsTotal = 0;


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

    public void withdraw(String account, double amount){
        if(account == "Savings"){
            if(savingsBalance > 0){
                savingsBalance -= amount;
                accountsTotal -= amount;
            }
        }
        else if (account == "Checking"){
            if(savingsBalance > 0){
                checkingBalance -= amount;
                accountsTotal -= amount;
            }
        }
        else{
            System.out.println("Voided transaction");
        }
    }

    public double getTotalbalance(){
        return accountsTotal;
    }

    //  getters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }



}