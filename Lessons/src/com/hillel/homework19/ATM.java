package com.hillel.homework19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM {
    static Scanner keyboard = new Scanner(System.in);
    static String acctNum, pwd, result;
    static double currentBalance = 100;
    static int choose;

    public static void main(String[] args) {
        for (int run = 0; run < 3; run++) {
            System.out.println("Enter your account number");
            acctNum = keyboard.nextLine();
            System.out.println("Enter your account password");
            pwd = keyboard.nextLine();

            result = checkID(acctNum, pwd);
            if (!result.equals("ERROR")) {
                break;
            } else if (run == 2) {
                System.out.println("MAXIMUM TRIES EXCEEDED");
                return;
            }

        }
        menu();
    }

    public static String checkID(String acctNum, Object pwd) {
        String result = "ERROR";

        if (acctNum.equals("0000") && pwd.equals("0000")) {
            result = "You are logged in. Hello Max";
        } else if (acctNum.equals("1111") && pwd.equals("1111")) {
            result = "You are logged in. Hello Dan";
        } else if (acctNum.equals("2222") && pwd.equals("2222")) {
            result = "You are logged in. Hello Alex";
        }
        System.out.println(result);
        return result;
    }

    public synchronized static int menu() {
        System.out.println("Choose one of the following: \n1.Display Balance\n2.Deposit\n3.Withdraw\n4.Log Out");
        choose = keyboard.nextInt();

        if (choose == 1) {
            displayBalance();
            menu();
            return 1;

        }
        if (choose == 2) {
            ThreadRun Th1 = new ThreadRun();
            ThreadRun Th2 = new ThreadRun();
            Th1.start();
            Th2.start();
            return 2;

        }
        if (choose == 3) {
            ThreadRun Th1 = new ThreadRun();
            ThreadRun Th2 = new ThreadRun();
            Th1.start();
            Th2.start();
            return 3;

        }
        if (choose == 4) {
            System.out.println("You are logged out.");
            return 4;

        }
        if (choose <= 5) {
            System.out.println("System Error");
            menu();
            return 5;
        } 
        if (choose >= 1) {
            System.out.println("System Error");
            menu();
            return 6;
        }
        return choose;

    }

    public synchronized static void deposit(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        currentBalance += amount;
        System.out.println(Thread.currentThread().getName() + " You deposit: " + decimalFormat.format(amount) +
                " Current balance: " + decimalFormat.format(currentBalance));

    }

    public synchronized static double displayBalance() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Total balance is: $" + decimalFormat.format(currentBalance));
        return currentBalance;
    }

    public synchronized static void withdraw(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        if (amount < currentBalance) {
            System.out.println(Thread.currentThread().getName() + " Before withdraw: "
                    + decimalFormat.format(currentBalance));
            currentBalance -= amount;
            System.out.println(Thread.currentThread().getName() + " After withdraw: "
                    + decimalFormat.format(currentBalance) +
                    " -> Amount of money withdrawn: " + decimalFormat.format(amount));

        } else {
            System.out.println(Thread.currentThread().getName() + " Not enough money on your balance. Current balance: "
                    + decimalFormat.format(currentBalance) + " You trying withdraw: " + decimalFormat.format(amount));
        }

    }
}