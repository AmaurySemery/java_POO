package com.academiews;

public class VatIntermediary implements VatCalculator {
    private int amountHT;

    public VatIntermediary(int amountHT) {
        this.amountHT = amountHT;
    }

    public int getAmountHT() {
        return amountHT;
    }

    public void setAmountHT(int amountHT) {
        this.amountHT = amountHT;
    }

    @Override
    public double calculateTTC() {
        return this.amountHT * 1.1;
    }
}
