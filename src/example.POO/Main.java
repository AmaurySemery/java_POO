package example.POO;

public class Main {
    public static void main(String[] args) {
        
        int amount = (int) readNumber("Somme principale : ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Taux d'intérêt annuel : ", 1, 30);
        byte years = (byte) readNumber("Nombre d'années : ", 1, 30);

        double mortgage = MortgageCalculator.calculateMortgage(amount, annualInterest, years);
        MortgageReport.showMortgage(mortgage);
        MortgageReport.showPaymentSchedule(amount, annualInterest, years);
    }
}
