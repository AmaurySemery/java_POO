package example.POO;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    public static double checkUserInput(String prompt, double min, double max) {

        double value;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if(value >= min && value <= max)
                break;
            System.out.println("Veuillez rentrer une valeur entre " + min + " et " + max);
            
        }

        return value;
    }

    public static double checkUserInput(String prompt) {

        return scanner.nextDouble();
    }
    
}
