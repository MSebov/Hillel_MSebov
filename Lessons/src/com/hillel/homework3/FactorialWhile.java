package com.hillel.homework3;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int count = 1;
        int factorial = 1;
        while (count < number) {
            count++;
            factorial *= count;
        }
        System.out.println(factorial);
    }
}
