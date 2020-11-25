package com.hillel.homework6;

public abstract class WildAnimal extends Animal {
    public WildAnimal(String id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    protected boolean isPredator;

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }
}
