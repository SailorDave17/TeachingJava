package oop;

public class BankAccountApp {
    public static void main(String[] args) {
        //creating a new bank account >> think instantiate an object

        BankAccount account1 = new BankAccount();
        account1.accountNumber = "0123456789";
        account1.name = "Dave A";
        account1.balance = 1000;


        account1.deposit(1500);
        account1.deposit(1500);
        account1.deposit(1500);
        account1.deposit(1500);
        account1.withdraw(2000);

        System.out.println(account1);

        BankAccount account2 = new BankAccount("Checking Account");
        account2.accountNumber = "7894561233";

        BankAccount account3 = new BankAccount("Savings Account", 10000);
        BankAccount.accountNumber = "6546854";
        account3.checkBalance();

        //Demo for Inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.interestRate = "4.5";
        cd1.name = "Mary";
        cd1.accountType = "CD Account";
        System.out.println(cd1);
        cd1.compound();



    }
}
