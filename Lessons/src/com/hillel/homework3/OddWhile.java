package com.hillel.homework3;

public class OddWhile {
    public static void main(String[] args) {
        int count = 0;
        while (count <100) {
            count++;
            if (count % 2 !=0)
            System.out.println(count);
        }
    }
}

