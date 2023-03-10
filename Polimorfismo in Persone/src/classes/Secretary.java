package classes;

import interfaces.Employee;

public class Secretary implements Employee {

    private double salary;

    public Secretary(double salary) {

        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public Account getAccount() {
        return new Account(salary, "Employee Account");
    }
}
