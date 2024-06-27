package com.academiews;

public class VatReport {
    private VatCalculator vatCalculator;

    //public VatReport(VatCalculator vat) {
    //    this.vatCalculator = vat;
    //}

    public void showTtcReport() {
        var ttc = vatCalculator.calculateTTC();
        System.out.println(ttc);
    }

    public void setVatCalculator(VatCalculator vatCalculator) {
        this.vatCalculator = vatCalculator;
    }
}
