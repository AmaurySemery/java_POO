package example.POO;

import java.text.NumberFormat;

public class MortgageCalculator {

    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    private int amount;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int amount, float annualInterest, byte years) {
        this.amount = amount;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest(float annualInterest) {
        this.annualInterest = annualInterest;
    }

    public byte getYears() {
        return years;
    }

    public void setYears(byte years) {
        this.years = years;
    }

    public double calculateMortgage() {

        short numberOfPayments = (short) (this.years * MONTHS_IN_YEAR);
        float monthlyInterest = this.annualInterest / PERCENT / MONTHS_IN_YEAR;

        double mortgage = this.amount
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public double calculateBalance(
            short numberOfPaymentMade) {

        short numberOfPayments = (short) (this.years * MONTHS_IN_YEAR);
        float monthlyInterest = this.annualInterest / PERCENT / MONTHS_IN_YEAR;

        double balance = this.amount
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }
}
