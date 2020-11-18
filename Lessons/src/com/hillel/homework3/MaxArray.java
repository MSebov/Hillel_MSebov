package com.hillel.homework3;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {6, 82, 8, 6, 61, 82, 16, 6, 82, 82, 0, 82};
        int max = arr[0];
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        for (int j = 0; j < arr.length; j++) {
            if (max == arr[j]) {
                System.out.println(max);
            }
        }
    }
}
