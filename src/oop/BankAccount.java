package oop;

public class BankAccount {
// Define Variables

    String accountNumber;

    //static >> belongs to the CLASS, not the object instance
    //final>> constant (you will often see static final)
    static final String routingNumber = "000000";
    String name;
    String ssn;
    String accountType;

    //Constructor definitions: unique methods
        //1. They are used to define/setup/initialize properties of an object
        //2. Constructors are IMPLICITLY called upon instantiation (automatically when object is called)
        //3. The same name as the class itself
        //4. Constructors have NO return type

    BankAccount(){
        System.out.println("new account is created");

    }

    // Overloading: call same method name with different arguments

    BankAccount(String accountType){
        System.out.println("New Account: " + accountType);

    }

    BankAccount(String accountType, double initDeposit){

        System.out.println("New Account: " + accountType);
        System.out.println("New Account Initial deposit: " + initDeposit);
        System.out.println();

    }

    //Define Methods

    void deposit(){

    }
    void withdraw(){

    }
    void checkBalance(){

    }

    void getStatus(){

    }
}
