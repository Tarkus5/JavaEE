import classes.Account;
import classes.Programmer;
import classes.Secretary;
import interfaces.Employee;
import classes.Company;

public class Main {
    public static void main(String[] args) {
        Company culo = new Company(1500000);

        Secretary antonia = new Secretary(1100);
        Programmer pippo = new Programmer(1500);
        Account carlo = new Account(2000);

        culo.addEmployee(antonia);
        culo.addEmployee(pippo);
        culo.addEmployee(carlo);

        double pay = culo.payEmployees();
        System.out.println("La somma da pagare ai dipendenti è: " + pay + "€");
        double budget = culo.budget();
        System.out.println("Il budget aziendale è di: " + budget  + "€");
        System.out.println("");
        System.out.println("Il capitale rimasto all'azienda è di: " + (budget - pay) + "€");
    }
}