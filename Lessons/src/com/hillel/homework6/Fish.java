package com.hillel.homework6;

public class Fish extends Pet {
    public Fish(String id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String makeVoice() {
        String voice = ".......";
        System.out.println(voice);

        return voice;
    }
}
