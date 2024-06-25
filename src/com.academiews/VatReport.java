package com.academiews;

public class VatReport {
    private VatNormal vat; // 20%

    public VatReport() {
        vat = new VatNormal(1000);
    }

    public void showTtcReport() {
        var ttc = vat.calculateTTC();
        System.out.println(ttc);
    }
}
