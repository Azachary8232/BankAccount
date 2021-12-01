import java.util.Random;

public class BankAccount{

    private double checkingBalance;
    private double savingsBalance;
    private int accountNumber;
    private static int numberOfAccounts = 0;
    private static double accountsTotal = 0;


    public BankAccount(){
        numberOfAccounts++;
        accountNumber = accountCreator();
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

    private int accountCreator(){
        int num = rand.nextInt(9999999999);
        num += 1000000000;
        return num;
    }

    //  getters
    public double getTotalbalance(){
        return accountsTotal;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }



}