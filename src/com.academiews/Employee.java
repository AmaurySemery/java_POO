package com.academiews;

public class Employee {
    public int baseSalary;
    public int hourlyRate;

    public int calculateSalary(int extraHours) {
        return this.baseSalary + (extraHours * this.hourlyRate);
    }
}
