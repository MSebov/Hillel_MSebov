package com.hillel.homework3;

import java.util.Scanner;

public class FactorialDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int count = 1;
        int factorial = 1;
        do {
            count++;
            factorial *= count;
        }
        while (count < number);
        System.out.println(factorial);
    }
}
