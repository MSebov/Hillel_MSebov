package com.hillel.homework6;

public abstract class Animal implements MakeSound {
    private String id;
    private int age;
    private int weight;
    private String color;

    public Animal(String id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;



    }
}