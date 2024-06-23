package com.academiews;

public class Accountant extends Employee {

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

}
