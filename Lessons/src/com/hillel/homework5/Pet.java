package com.hillel.homework5;

public abstract class Pet extends Animal {
    protected String name;
    protected boolean isVaccinated;

    public Pet(String id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }
}
