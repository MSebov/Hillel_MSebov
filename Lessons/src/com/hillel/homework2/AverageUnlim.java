package com.hillel.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class AverageUnlim {
    public static void main(String[] args) {
        double[] arr = new double[0];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number you want save in array if you want end enter \"0\" ");

        while (scan.hasNextDouble()) {
            double number = scan.nextDouble();
            if (number == 0) {
                break;
            } else {
                arr = newArray(arr);
                arr[arr.length - 1] = number;
            }
        }
        System.out.println(Arrays.toString(arr));
        countAverage(arr);
    }

    public static double[] newArray(double[] oldArray) {
        double[] arr = new double[oldArray.length + 1];
        if (oldArray.length > 0) {
            for (double i = 0; i < oldArray.length; i++) {
                arr[(int) i] = oldArray[(int) i];
            }
        }
        return arr;
    }

    public static void countAverage(double[] numbers1) {

        double average;
        if (numbers1.length > 0) {
            double sum = 0d;
            for (int i = 0; i < numbers1.length; i++) {
                sum += numbers1[i];
            }
            System.out.println("Sum of numbers is: " + sum);
            average = sum / numbers1.length;
            System.out.println("Average is: " + average);
        }
    }
}
