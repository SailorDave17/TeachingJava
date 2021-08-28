package oop;

public class BankAccountApp {
    public static void main(String[] args) {
        //creating a new bank account >> think instantiate an object

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("Checking Account");
        BankAccount account3 = new BankAccount("Savings Account", 10000);
    }
}
