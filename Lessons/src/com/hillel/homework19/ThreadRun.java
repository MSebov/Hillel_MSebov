package com.hillel.homework19;

import java.text.DecimalFormat;

public class ThreadRun extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            double tempAdd = 100 + (Math.random() * 1000);
            double tempRemove = 100 + (Math.random() * 500);
            if (tempAdd <= 500) {
                try {
                    ATM.deposit(tempAdd);
                    sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    ATM.withdraw(tempRemove);
                    sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(getName() + " end. Your balance is: " + decimalFormat.format(ATM.currentBalance));
        ATM.menu();
    }
}

