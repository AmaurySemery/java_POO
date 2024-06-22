package com.academiews;

public class Employee {
    // Ces données sont privées car on souhaite les protéger
    private int baseSalary;
    private int hourlyRate;

    // Les getter et les setter sont publiques pour pouvoir accéder à ses données et les modifier
    public int getBaseSalary() { // getter ou accesseur
        return this.baseSalary;
    }

    public void setBaseSalary(int baseSalary) { // setter ou mutateur
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot bet 0 or less !");
        this.baseSalary = baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hour Rate Salary cannot bet 0 or less !");
        this.hourlyRate = hourlyRate;
    }

    // La méthode est publique pour pouvoir l'appeler depuis le main
    public int calculateSalary(int extraHours) {
        return this.baseSalary + (extraHours * this.hourlyRate);
    }
}
