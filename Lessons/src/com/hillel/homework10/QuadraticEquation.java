package com.hillel.homework10;

public class QuadraticEquation {
    public static void main(String[] args) {
    }

    public static void squareRoot() {

        double a = 4;
        double b = -20;
        double c = 25;
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Two roots");
            System.out.println(x1);
            System.out.println(x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("One root");
            System.out.println(x);
        } else {
            System.out.println("No roots");
        }
    }
}



