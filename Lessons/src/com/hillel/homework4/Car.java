package com.hillel.homework4;
//залить полный бак с учетом объема остатка
//определить остаток топлива по преодолении N км
//определить сколько надо до заправить топлива при преодолении N км

public class Car {
    public double fuelTank; // обьем бака
    public double fuelLevel; // уровень топлева
    public double fuelConsumption; // расход


    public Car(double fuelTank, double fuelLevel, double fuelConsumption) {
        this.fuelTank = fuelTank;
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;


    }


    public double refillFuel() {
        System.out.printf("Current fuel level is: %.2f ", fuelLevel);
        double fuelDifference;
        if (fuelLevel < fuelTank) {
            fuelDifference = fuelTank - fuelLevel;
            System.out.printf("need to refill %.2f litres of fuel \n", fuelDifference);
            fuelLevel = fuelTank;
            System.out.printf("Refueling... Tank is refueled. Your current fuel level is : %.2f \n", fuelLevel);
        }
        return fuelLevel;

    }

    public double fuelRemaining(double distance) {
        double fuelPerDistance;
        double fuelConsumptionPerOneMile;
        fuelConsumptionPerOneMile = fuelConsumption / 100;
        fuelPerDistance = fuelConsumptionPerOneMile * distance;
        fuelLevel -= fuelPerDistance;
        if (fuelLevel <= 0) {
            System.out.println("You don't have enough fuel for this trip");
        } else {
            System.out.printf("You have %.2f litres of fuel after driving %.2f KM \n", fuelLevel, distance);
        }

        return fuelLevel;
    }


    public void needToRefill(double distance) {
        double coast = 32.85;
        double needToRefill;
        double fuelPerDistance;
        double fuelConsumptionPerOneMile;
        fuelConsumptionPerOneMile = fuelConsumption / 100;
        fuelPerDistance = fuelConsumptionPerOneMile * distance;
        //fuelLevel -= fuelPerDistance;
        needToRefill = fuelLevel - fuelPerDistance;
        if (needToRefill <= 0) {
            System.out.println("Need to refill " + needToRefill + " litres of fuel");
        } else {
            System.out.printf("Your distance is: %.2f Need to refill: %.2f litre of fuel.", distance, needToRefill);
        }
    }
}