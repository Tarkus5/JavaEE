package classes;
import interfaces.Employee;
import java.util.Arrays;

public class Company {
    private double capital;
    private Employee[] employees;
    private int numberEmployee;

    public Company(double capital) {
        this.capital = capital;
        this.employees = new Employee[15];
        numberEmployee = 0;
    }

    public void addEmployee(Employee name){
        try {
            employees[numberEmployee] = name;
            numberEmployee++;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Non puoi più assumere personale");
        }
    }

    Account companyAccount = new Account(capital, "Appple");

    public void payEmployees(){
        //int sum = 0;
        for (int i = 0; i < numberEmployee; i++){
            //sum += employees[i].getSalary();
            companyAccount.transferMoney(companyAccount, employees[i].getAccount(), employees[i].getSalary());
        }
       // return sum;
        companyAccount.getAmount();
        System.out.println("Hai effettuato bonifici per un totale di " + (capital - companyAccount.getAmount()) + "€");
        System.out.println("Il tuo capitale rimanente è di " + companyAccount.getAmount() + "€");

    }

    public double budget() {
        return capital;
    }
}