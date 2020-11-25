package com.hillel.homework6;

public class Lion extends WildAnimal{
    public Lion(String id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String makeVoice() {
        String voice1 = "Hello! I am a wild animal and I am angry";
        String voice2 = "Hello! I am a wild animal ";
        if (isPredator == true) {
            System.out.println(voice1);
            return voice1;

        }else {
            System.out.println(voice2);
        }
        return voice2;
    }
}
