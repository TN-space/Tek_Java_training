package com.teksystem;

public class Employee {
    // Declared fields
    long employeeId;
    String employeeName;
    String employeeAddress;
    Long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    // Default constructor
    public Employee() {};
    // Overloaded constructor
    public Employee(long employeeId, String employeeName, String employeeAddress, Long employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    public double calculateSalary() {
        double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
        return salary;
    }

    public double calculateTransportAllowance() {
        double transportAllowance = 10*basicSalary /100;
        return transportAllowance;
    }
}
