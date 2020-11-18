package com.hillel.homework3;

import java.util.Arrays;

public class SwapMinMax {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int iMax = 0;
        int min = arr[0];
        int iMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                iMax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                iMin = i;
            }
        }
        arr[iMin] = max;
        arr[iMax] = min;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
