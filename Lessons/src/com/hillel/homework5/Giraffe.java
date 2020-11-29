package com.hillel.homework5;

public class Giraffe extends Wild {
    public Giraffe(String id, int age, int weight, String color, boolean isPredator) {
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