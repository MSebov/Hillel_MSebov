package com.hillel.homework3;

public class NegativeNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        int number1 = 1;
        for (int i = 0; i < numbers.length; i++) {
            number1--;
            numbers[i] = number1;
            if (number1 % 5 == 0) {
                System.out.print(number1 + ", ");
            }
        }
    }
}
