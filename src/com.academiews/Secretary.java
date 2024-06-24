package com.academiews;

public class Secretary extends Employee {

    public Secretary(int baseSalary) {
        super(baseSalary);
    }

    public Secretary(int baseSalary, int hourlyRate) {
        super(baseSalary, hourlyRate);
    }

    @Override
    public void work() {
        System.out.println("Je fais un boulot de secrétaire");
    }
    

}
