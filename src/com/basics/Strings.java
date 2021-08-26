package com.basics;

public class Strings {
    public static void main(String[] args) {
        String bookTitle;
        String wordChoice = "Java";
        bookTitle = "Head First Java";
        if(bookTitle.contains(wordChoice)){
            System.out.println("The book contains the word " + wordChoice);
        }

        String browser = "Chrome";
        // (browser == "chrome")
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("The browser is Chrome");
        }

        String firstName = "Dave";
        String lastName = "Alvarado";
        String SSN = "123456789";

        System.out.println("There are " +SSN.length() + " digits in your SSN.");

        //Print the initials plus the last 4 digits of SSN

        System.out.print(firstName.substring(0,1));
        System.out.println(lastName.substring(0,1));
        System.out.print(SSN.substring(5));



    }
}
