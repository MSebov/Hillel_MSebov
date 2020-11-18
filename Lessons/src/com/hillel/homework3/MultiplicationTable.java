package com.hillel.homework3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fill number:");
        int number = scan.nextInt();
        for (int i = 1; i < 11; i++) {

            System.out.println(i + " * " + number + " = " + i * number );
        }
        System.out.println("");
    }
}

