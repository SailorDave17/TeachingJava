package com.basics;

public class FunctionsSimplified {

    public static void main(String[] args) {
        int numA = 5;
        int numB = 2;
        printName();
        addNumbers(numA, numB);
        multiplyNumbers(numA, numB);



    }

    static void printName(){
        String name = "Dave";
        System.out.println("My name is " + name);
    }



    static void addNumbers(int numberA, int numberB){
       int sum = numberA + numberB;
        System.out.println(sum);

    }

    static int multiplyNumbers(int valueA, int valueB){
        int product = valueA * valueB;
        addNumbers(product, product);
        return product;

    }


}
