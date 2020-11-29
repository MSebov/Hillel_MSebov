package com.hillel.homework5;

public class Dog extends Pet {

    public Dog(String id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String makeVoice() {
        String voice = "Hello! My name is " + name + " Wooof";
        System.out.println(voice);

        return voice;
    }

    public void takeHome() {

    }
}
