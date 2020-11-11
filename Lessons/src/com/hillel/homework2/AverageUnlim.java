package com.hillel.homework2;

import java.util.Arrays;

public class AverageUnlim {
    public static void main(String[] args) {

        double[] numbers = {5d, 8d, 4d};
        System.out.println("Numbers are: " + Arrays.toString(numbers));
        countAverage(numbers);

    }

    public static void countAverage(double[] numbers1) {

        double average;
        if (numbers1.length > 0) {
            double sum = 0d;
            for (int i = 0; i < numbers1.length; i++) {
                sum += numbers1[i];
            }
            System.out.println("Summ of numbers is: " + sum);
            average = sum / numbers1.length;
            System.out.println("Average is: " + average);
        }
    }
}
