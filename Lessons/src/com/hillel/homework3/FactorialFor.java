package com.hillel.homework3;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int count = 1;
        for (int i = 1; i <= number; i++) {
            count *= i;
        }
        System.out.println(count);
    }
}
