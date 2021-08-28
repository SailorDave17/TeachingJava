package com.basics;

public class Factorals {
    public static void main(String[] args) {
        int i, fact = 1;
        int num1 = 6;
        for(i=1;i<num1;i++){
            fact = fact*i;
        }

        System.out.println(fact);

    }
}
