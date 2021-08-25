package com.basics;

public class Cities {
    public static void main(String[] args) {

        //Declare & define the array
        String[] cities = {"New York", "Columbus", "Chicago", "Ft. Lauderdale"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);

        //Declare the array
        String[] countries;

        //Define the array
        countries = new String[3];
        countries[0] = "United States";
        countries[1]= "Canada";
        countries[2]= "Mexico";
        System.out.println(countries[2]);



        //Declare & define the array (only size)
        String[] states = new String[5];
        states[0] = "Ohio";
        states[1] = "Kentucky";
        states[2] = "Alaska";
        states[3] = "Florida";
        states[4] = "Michigan";

        //how do we do this using loops?

//        System.out.println(states[0]);
//        System.out.println(states[1]);
//        System.out.println(states[2]);
//        System.out.println(states[3]);
//        System.out.println(states[4]);


        int i = 0;

        //Do Loop: Enters the loop, THEN tests the condition

        System.out.println("--------------------------------------");
        System.out.println("Printing with a Do While Loop");
        do{
            System.out.println("State: " + states[i]);
            i++;
        }while (i<5);

//        While Loop: tests condition FIRST, then enters the loop
        int n= 0;
        boolean stateFound = false;
        while (!stateFound){
            String state = states[n];
            System.out.println(state);
             if(state == "Florida"){
                 System.out.println("STATE FOUND");
                 stateFound = true;

             }
             n++;

        }

        //For Loop: Best structure for iterating through an array
        System.out.println("--------------------------------------");
        System.out.println("Printing with a For loop");
        for (int x = 0; x < 5; x++){
            System.out.println(states[x]);
        }





    }
}
