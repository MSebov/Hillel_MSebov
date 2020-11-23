package com.hillel.homework4;
//в классе Мейн надо определить и вывести на экран сколько надо долить топлива и его стоимость если маршрут у нас Одесса - Киев
//
//+ 2 обязательные остановки для дозаправки Кривое Озеро и Жашков
//
//+ сколько будет стоить полная поездка
//
//+ остаток топлива в пункте назначения
public class Main {
    public static void main(String[] args) {
        Car oldAssCar = new Car(80, 25, 10);
        oldAssCar.refillFuel();
        oldAssCar.needToRefill(473);
        oldAssCar.fuelRemaining(473);

    }
}
