package com.plurasight;

public class Employee {
    int employeeID;
    String name, department;
    double payRate, hoursWorked;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        if (this.hoursWorked <= 40) {
            return this.hoursWorked * this.payRate;
        } else {
            double regularPay = 40 * this.payRate;
            double overtimeHours = this.hoursWorked - 40;
            double overtimePay = overtimeHours * this.payRate * 1.5;
            return regularPay + overtimePay;
        }
    }

    public double getRegularHours() {
        return Math.min(this.hoursWorked, 40.00);
    }

    public double getOvertimeHours() {
        return Math.max(this.hoursWorked - 40, 0);
    }

}
