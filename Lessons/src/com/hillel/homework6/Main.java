package com.hillel.homework6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cat --------------------->");
        Cat cat = new Cat("Pet", 3, 5, "Black", "Barsik" ,true);
        cat.makeVoice();

        System.out.println("GideDog --------------------->");
        Dog helper = new GuideDog("Pet", 8, 12, "White", "Rex", true, true);
        helper.makeVoice();

        System.out.println("Giraffe --------------------->");
        Giraffe giraffe = new Giraffe("Wild", 7,120,"Yellow", false);
        giraffe.makeVoice();

        System.out.println("Lion --------------------->");
        Lion lion = new Lion("Wild" ,18, 315,"Orange",true);
        lion.makeVoice();

        System.out.println("Dog --------------------->");
        Dog dog = new Dog("Pet", 5, 11, "Ginger", "Karat", true);
        dog.makeVoice();

        System.out.println("Fish --------------------->");
        Fish fish = new Fish("Pet", 2,1, "Red", "Noname", false);
        fish.makeVoice();



    }
}
