package com.academiews;

public class Employee {
    // Ces données sont privées car on souhaite les protéger
    private int baseSalary;
    private int hourlyRate;

    // Overloading du constructeur pour n'implémenter que le baseSalary
    public Employee(int baseSalary) {
        setBaseSalary(baseSalary);
    }

    // Constructeur pour initialiser des valeurs aux champs
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    // Les getter et les setter sont publiques pour pouvoir accéder à ses données et les modifier
    // Elles peuvent être rendues privées en présence d'un constructeur, utiles ici si on ne veut pas modifier des salaires à la volée par exemple avec main
    public int getBaseSalary() { // getter ou accesseur
        return this.baseSalary;
    }

    private void setBaseSalary(int baseSalary) { // setter ou mutateur
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot bet 0 or less !");
        this.baseSalary = baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hour Rate Salary cannot bet 0 or less !");
        this.hourlyRate = hourlyRate;
    }

    // La méthode est publique pour pouvoir l'appeler depuis le main
    public int calculateSalary(int extraHours) {
        return this.baseSalary + (extraHours * this.hourlyRate);
    }

    public int calculateSalary() { // overloading (lié au polymorphisme) qui consiste à appeler plusieurs fois une même méthode avec des paramètres différents
        return calculateSalary(0);
    }
}
