package com.basics;

public class Weather {
    public static void main(String[] args) {
        // This program will give us suggestions of what to wear based on the weather(temperature)

        int temperature = 20;
        int sunCondition = 90;

        if (temperature > 80) {
            System.out.println("It's Nice out, wear shorts and a T-Shirt");
        } else if ((temperature > 60) && (sunCondition > 80)) {
            System.out.println("It's a little cooler. Wear jeans and a long sleeve shirt");
            System.out.println("Wear sunglasses as well");

        } else if ((temperature > 50) || (sunCondition < 70)) {
            System.out.println("This a cool, overcast day, wear warm clothes");
        } else {
            System.out.println("It's pretty cold, bring a jacket");


        }
    }
}
