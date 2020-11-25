package com.hillel.homework6;

public class GuideDog extends Dog {
    protected boolean isTrained;

    public GuideDog(String id, int age, int weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    @Override
    public void takeHome() {
        super.takeHome();
        System.out.println("Ill get you home Woooof! ");
    }

    @Override
    public String makeVoice() {
        String mess = "Dog is not traned";
        if (isTrained == true) {
            String voice = "I can take you home.";
            System.out.println(voice);
            return voice;
        }else {
            System.out.println(mess);
        }
        return mess;

    }

}
