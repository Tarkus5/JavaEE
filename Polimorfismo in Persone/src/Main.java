import classes.*;
import interfaces.Employee;

public class Main {
    public static void main(String[] args) {
        Company Appple = new Company(1500000);

        Secretary antonia = new Secretary(1100);
        Programmer pippo = new Programmer(1500);
        Accountant carlo = new Accountant(2000);

        Appple.addEmployee(antonia);
        Appple.addEmployee(pippo);
        Appple.addEmployee(carlo);

        //double pay = Appple.payEmployees();
       /*
        System.out.println("La somma da pagare ai dipendenti è: " + pay + "€");
        double budget = Appple.budget();
        System.out.println("Il budget aziendale è di: " + budget  + "€");
        System.out.println("");
        System.out.println("Il capitale rimasto all'azienda è di: " + (budget - pay) + "€");
        */

        Account emanuele = new Account(15000, "Emanuele");
        Account claudio = new Account(18000, "Claudio");

        emanuele.transferMoney(emanuele, claudio, 2000);

        //Appple.payEmployees();

    }
}