package oop;

public class BankAccountApp {
    public static void main(String[] args) {
        //creating a new bank account >> think instantiate an object

        BankAccount account1 = new BankAccount();
        account1.accountNumber = "0123456789";

        BankAccount account2 = new BankAccount("Checking Account");
        account2.accountNumber = "7894561233";

        BankAccount account3 = new BankAccount("Savings Account", 10000);
        account3.accountNumber = "6546854";

        System.out.println(account1.routingNumber);
        System.out.println(account2.routingNumber);
        System.out.println(account3.routingNumber);
    }
}
