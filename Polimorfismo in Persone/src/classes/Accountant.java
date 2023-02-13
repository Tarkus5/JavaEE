package classes;

import interfaces.Employee;

public class Accountant implements Employee {
    private double salary;

    public Accountant(double salary) {

        this.salary = salary;
    }

    @Override
    public double getSalary() {

        return this.salary;
    }

    @Override
    public Account getAccount() {
        return new Account(salary, "Employee Account");
    }
}
