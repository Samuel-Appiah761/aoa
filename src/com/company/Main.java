package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{4,6,1,8,3,7,9,0,10};
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
