package com.academiews;

public class VatNormal {

    private int amountHT;

    public VatNormal(int amountHT) {
        this.amountHT = amountHT;
    }

    public int getAmountHT() {
        return amountHT;
    }

    public void setAmountHT(int amountHT) {
        this.amountHT = amountHT;
    }

    public double calculateTTC() {
        return this.amountHT * 1.2;
    }

    
}
