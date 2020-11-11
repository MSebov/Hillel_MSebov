package com.hillel.homework2;

import java.util.Scanner;

public class BankOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fill the amount you want to deposit.");
        double cash = scan.nextDouble();
        System.out.println("Fill the percent.");
        double percent = scan.nextDouble();
        System.out.println("Fill the quantity of years.");
        int years = scan.nextInt();


        double fullProfit = 0;
        for (int i = 0; i < years; i++) {
            double addition = cash * percent / 100;
            cash += addition;
            System.out.printf("After %d year you have %.2f with %.2f of percents \n", (i+1), cash, addition);
            fullProfit += addition;
        }

        System.out.printf("In the end of %d years you will have %.2f money and %.2f of profit", years, cash, fullProfit);
    }
}

