package com.hillel.homework6;

public abstract class Animal implements MakeSound {
    protected String id;
    protected int age;
    protected int weight;
    protected String color;

    public Animal(String id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;



    }
}
