package com.hillel.homework3;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int pow = s.nextInt();
        int count = number;
        for (int i = 0; i < pow - 1; i++) {
            count = count * number;
            System.out.println(count);
        }
        System.out.println(Math.pow(number, pow));

    }
}
