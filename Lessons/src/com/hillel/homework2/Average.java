package com.hillel.homework2;

public class Average {
    public static void main(String[] args) {

        double num1 = 5d;
        System.out.println("First number is: " + num1);
        double num2 = 4d;
        System.out.println("Second number is: " + num2);
        System.out.println("Average is: " + countAverage(num1, num2));

    }
    public static double countAverage (double x, double y) {
        double sum = x + y;
        double averageNum = sum / 2;
        return averageNum;

    }
}
