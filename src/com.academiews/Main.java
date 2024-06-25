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

 /* 

 Exemple pour réduire le couplage
 public static void main(String[] args) {
    var browser = new Browser();
    browser.navigate("academiews.fr");
 }

*/

/* 
// Exemple avec utilisation d'un constructeur
public static void main(String[] args) {
    var employee = new Employee(50_000, 50);
    System.out.println(employee.calculateSalary(20));

    var employee2 = new Employee(70_000);
    System.out.println(employee2.calculateSalary());

    System.out.println(Employee.showNbrEmployees());

}
*/

/* 
// Héritage
public static void main(String[] args) {
    var accountant = new Accountant(50_000, 50);
    System.out.println(accountant.calculateSalary(20));
}
*/

/*
// Heritage 2
public static void main(String[] args) {
    var obj = new Object();
    obj.getClass(); // metadata
    obj.toString(); // string representation
    obj.hashCode(); // address of the object in memory

    var accountant = new Accountant(50_000);
    System.out.println(accountant.hashCode());
}
*/

/* 
// Heritage 3
public static void main(String[] args) {
    var employee = new Employee(50_000);
    employee.showSomethingInConsole();
}
*/

/* 
// Overriding
public static void main(String[] args) {
    var accountant = new Accountant(50_000);
    System.out.println(accountant.calculateSalary(0));
    accountant.toString();
}
*/

/* 
// Polymorphisme
public static void main(String[] args) {
    Employee [] listEmployees = { new Accountant(50_000), new Secretary(30_000, 20)};

    for(var employee : listEmployees) {
        System.out.println(employee.calculateSalary());
        employee.work();
    }
}
*/

// Interface
public static void main(String[] args) {
    
}

}