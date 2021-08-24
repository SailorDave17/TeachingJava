package com.basics;

public class Weather {
    public static void main(String[] args) {
        // This program will give us suggestions of what to wear based on the weather(temperature)

        int temperature = 20;
        String sunCondition = "Sunny";

        if (temperature > 80) {
            System.out.println("It's Nice out, wear shorts and a T-Shirt");
        } else if (temperature > 60) {
            System.out.println("It's a little cooler. Wear jeans and a long sleeve shirt");

        } else {
            System.out.println("It's pretty cold, bring a jacket");
        }
    }
}
