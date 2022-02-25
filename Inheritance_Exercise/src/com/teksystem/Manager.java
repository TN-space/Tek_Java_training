package com.teksystem;

public class Manager extends Employee{
    // Default constructor
    public Manager() {}

    // Overloaded constructor
    public Manager(long employeeId, String employeeName, String employeeAddress, Long employeePhone, double salary) {
        // reuse/reinitialize fields to equal passed-in parameters from super class - Employee
        super(employeeId, employeeName, employeeAddress, employeePhone);
        // ---
        this.basicSalary = salary;
    }

    @Override
    public double calculateTransportAllowance() {
        double transportAllowance = 15*basicSalary /100;
        return transportAllowance;
    }
}
