package com.hillel.homework5;

public abstract class Animal {
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

    public String makeVoice() {
        String voice = "Hello";
        return voice;
    }
}

