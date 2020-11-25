package com.hillel.homework6;

import com.hillel.homework6.Interface.InterfaceMakeSound;

public abstract class Animal implements InterfaceMakeSound {
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
