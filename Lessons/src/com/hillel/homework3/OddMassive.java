package com.hillel.homework3;

public class OddMassive {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int number = 0;
        for (int i = 0; i < 20; i++) {
            number++;
            if (number % 2 != 0) {
                arr[i] = number;

            }
            if (arr[i] !=0){
                System.out.print(arr[i] + ", ");
            }

        }
    }
}

