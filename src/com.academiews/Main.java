package com.academiews;

public class Main {

    public static void main(String[] args) {
        Vehicule car = new Vehicule();

        var scooter = new Vehicule();

        scooter.setModel("Renault");
        System.out.println(scooter.model.toUpperCase());

        car.setModel("Ferrari");
        System.out.println(car.model);
    }
}