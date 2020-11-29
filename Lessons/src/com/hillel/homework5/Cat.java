package com.hillel.homework5;

public class Cat extends Pet {

    public Cat(String id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }



    @Override
    public String makeVoice() {
        String voice = "Hello! My name is " + name + " Meow";
        System.out.println(voice);


        return voice;
    }
}