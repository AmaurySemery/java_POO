package example.POO;

import java.text.NumberFormat;

public class MortgageReport {

    public static void showPaymentSchedule(int amount, float annualInterest, byte years) {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Calendrier de paiement : ");
        System.out.println("-------------------------");

        for(short month = 1; month <= years * ProjectToRefactor.MONTHS_IN_Year; month++) {
            double balance = ProjectToRefactor.calculateBalance(amount, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static void showMortgage(double mortgage) {
        
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(morgage);
        
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Votre remboursement s'élève à : " + mortgageFormatted);
        System.out.println("-------------------------");

    }
}
