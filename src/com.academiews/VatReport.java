package com.academiews;

public class VatReport {
    private VatCalculator vatCalculator;

    //public VatReport(VatCalculator vat) {
    //    this.vatCalculator = vat;
    //}

    public void showTtcReport(VatCalculator vatCalculator) { // method injection
        this.vatCalculator = vatCalculator;
        var ttc = vatCalculator.calculateTTC();
        System.out.println(ttc);
    }

    //public void setVatCalculator(VatCalculator vatCalculator) { // setter injection
    //    this.vatCalculator = vatCalculator;
    //}
}
