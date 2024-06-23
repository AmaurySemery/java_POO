package example.POO;

public class Main {
    public static void main(String[] args) {
        
        int amount = (int) Console.checkUserInput("Somme principale : ", 1000, 1_000_000);
        float annualInterest = (float) Console.checkUserInput("Taux d'intérêt annuel : ", 1, 30);
        byte years = (byte) Console.checkUserInput("Nombre d'années : ", 1, 30);

        var mortgage = new MortgageCalculator(amount, annualInterest, years);
        var report = new MortgageReport(mortgage);

        report.showMortgage();
        report.showPaymentSchedule();
    }
}
