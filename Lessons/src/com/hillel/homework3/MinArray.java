package com.hillel.homework3;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {6, 8, 6, 61, 82, 16, 6,};
        int min = arr[0];
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

                }
        for (int j = 0; j < arr.length; j++) {
            if(min == arr[j]){
                System.out.println(min);
            }
        }
    }
}


