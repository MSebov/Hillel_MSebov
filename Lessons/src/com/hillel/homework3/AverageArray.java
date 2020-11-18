package com.hillel.homework3;

public class AverageArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int average = 0;
        if (numbers.length > 0) {
            int sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;
        }
        System.out.println(average);
    }
}
