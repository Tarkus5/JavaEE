package classes;

import interfaces.Employee;

public class Account implements Employee {
    private double salary;

    public Account(double salary) {

        this.salary = salary;
    }

    @Override
    public double getSalary() {

        return this.salary;
    }
}
