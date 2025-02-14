package com.learning.core.oops.inheritance;

 class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void calculateSalary() {
        System.out.println("Salary calculation is specific to employee type.");
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Full-time Employee Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Part-time Employee Salary: " + salary);
    }
}

public class Company {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Vivaan", 101, 5000);
        PartTimeEmployee pte = new PartTimeEmployee("Shri", 102, 20, 80);

        fte.displayEmployeeInfo();
        fte.calculateSalary();
        System.out.println();

        pte.displayEmployeeInfo();
        pte.calculateSalary();
    }
}

