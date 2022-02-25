package com.teksystem;

public class Trainee extends Employee{
    // Default constructor
    public Trainee() {}

    // Overloaded constructor
    public Trainee(long employeeId, String employeeName, String employeeAddress, Long employeePhone, double salary) {
        // reuse/reinitialize fields to equal passed-in parameters from super class - Employee
        super(employeeId, employeeName, employeeAddress, employeePhone);
        // ---
        this.basicSalary = salary;
    }
}
