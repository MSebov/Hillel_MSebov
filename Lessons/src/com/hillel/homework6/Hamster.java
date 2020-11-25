package com.hillel.homework6;

public class Hamster extends Pet {
    public Hamster(String id, int age, int weight, String color, String name, boolean isVaccinated, String name1) {
        super(id, age, weight, color, name, isVaccinated);
        this.name = name1;
    }

    private String name;
    @Override
    public String makeVoice() {
        String voice = "Hello! My name is " + name;
        System.out.println(voice);


        return voice;


    }
}
