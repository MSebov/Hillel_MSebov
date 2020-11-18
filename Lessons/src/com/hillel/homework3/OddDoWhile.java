package com.hillel.homework3;

public class OddDoWhile {
    public static void main(String[] args) {
        int count = 0;
        do {
            count++;
            if (count % 2 != 0)
                System.out.println(count);
        }
        while (count < 100);
    }
}
