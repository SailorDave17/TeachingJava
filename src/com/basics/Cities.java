package com.basics;

public class Cities {
    public static void main(String[] args) {
        //Declare & define the array
        String[] cities = {"New York", "Columbus", "Chicago", "Ft. Lauderdale"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);

        //Declare & define the array (only size)
        String[] states = new String[5];
        states[0] = "Ohio";
        states[1] = "Kentucky";
        states[2] = "Alaska";
        states[3] = "Florida";
        states[4] = "Michigan";
        System.out.println(states[0]);



        //Declare the array
        String[] countries;


        //Define the array
        countries = new String[3];
        countries[0] = "United States";
        countries[1]= "Canada";
        countries[2]= "Mexico";
        System.out.println(countries[2]);


    }
}
