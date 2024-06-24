package com.academiews;

public class Accountant extends Employee {

    private int prime = 10_000;

    public Accountant(int baseSalary) {
        super(baseSalary);
    }

    public Accountant(int baseSalary, int hourlyRate) {
        super(baseSalary, hourlyRate);
    }

    public String[] getCustomersList() {
        return customersList;
    }

    public void setCustomersList(String[] customersList) {
        this.getCustomersList = customersList;
    }

    private void showCustomerList() {
        for(int i = 0; i < this.getCustomersList.length; i++) {
            System.out.println(this.getCustomersList[i]);
        }
    }

    @Override
    public int calculateSalary(int extraHours) {
        return this.getBaseSalary() + (extraHours * this.getHourlyRate()) + prime;
    }

    @Override
    public String toString() {
        String msg = "Cet employé a une prime de " + prime;
        System.out.println(msg);
        return msg;
    }

    @Override
    public void work() {
        System.out.println("Je fais un boulot de comptable");
    }

}
