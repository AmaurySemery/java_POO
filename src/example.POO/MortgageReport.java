package example.POO;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void showPaymentSchedule() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Calendrier de paiement : ");
        System.out.println("-------------------------");

        for (short month = 1; month <= calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR; month++) {
            //var calculator = new MortgageCalculator(amount, annualInterest, years);
            double balance = calculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public void showMortgage() {

        //var calculator = new MortgageCalculator(amount, annualInterest, years);
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Votre remboursement s'élève à : " + mortgageFormatted);
        System.out.println("-------------------------");

    }
}
