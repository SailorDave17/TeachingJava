package com.basics;

public class LabOneC {
    public static void main(String[] args) {
        int myArray[] = new int[]{2,1,6,8,9,4};
        int max = getMax(myArray);
        int min = getMin(myArray);
        int ave = getAve(myArray);

        System.out.println("The minimum value of the Array is " + min);
        System.out.println("The average value of the Array is " + ave);
        System.out.println("The maximum value of the Array is " + max);

    }

    public static int getMin(int[]arrayInput){
        int minValue = arrayInput[0];
        for(int i =0; i<arrayInput.length; i++){
            if(arrayInput[i] < minValue){
                minValue = arrayInput[i];
            }
        }
        return minValue;

    }

    public static int getMax(int[]arrayInput){
        int maxValue = arrayInput[0];
        for (int i=0 ; i < arrayInput.length; i++){
            if(arrayInput[i]>maxValue){
                maxValue = arrayInput[i];
            }
        }
        return maxValue;
    }

    public static int getAve(int[]arrayInput){
        int totalValue = 0;
        for (int i = 0; i<arrayInput.length; i++){
            totalValue = totalValue + arrayInput[i];

        }

        return totalValue/arrayInput.length;

    }


}
