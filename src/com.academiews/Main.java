package com.academiews;

public class Main {

/*   
Exemple création de classe

public static void main(String[] args) {
        Vehicule car = new Vehicule();

        var scooter = new Vehicule();

        scooter.setModel("Renault");
        System.out.println(scooter.model.toUpperCase());

        car.setModel("Ferrari");
        System.out.println(car.model);
    }

*/  

/* 
Exemple code procédural

public static void main(String[] args) {
    int baseSalary = 30_000;
    int extraHours = 20;
    int hourlyRate = 30;

    int wage = calculateSalary(baseSalary, extraHours, hourlyRate);

    System.out.println(wage);

}

public static int calculateSalary(int baseSalary, int extraHours, int hourlyRate) {

    return baseSalary + (extraHours + hourlyRate);

}

 */

 /* 
 Exemple de correction d'un code procédural en POO

 public static void main(String[] args) {
    var employee = new Employee();
    employee.setBaseSalary(30_000);
    employee.setHourlyRate(35);
    System.out.println(employee.calculateSalary(20));
 }

 */

 public static void main(String[] args) {
    var browser = new Browser();
    browser.navigate("academiews.fr");
 }

}