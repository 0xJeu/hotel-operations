package com.plurasight;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Employee {
    int employeeID;
    String name, department;
    double payRate, hoursWorked, currentShiftTime;

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

    public void punchIn(double time) {
        this.currentShiftTime = time;
    }

    public void punchIn() {
        this.currentShiftTime = Double.parseDouble(LocalTime.now().format(DateTimeFormatter.ofPattern("HH.mm")));
    }

    public void punchOut(double time) {
        if (this.currentShiftTime > 0) {
            double shiftDuration = time - this.currentShiftTime;
            this.hoursWorked += shiftDuration;
            this.currentShiftTime = 0;
        } else {
            System.out.println("Employee hasn't punched in");
        }

    }

    public void punchOut() {
        if (this.currentShiftTime > 0) {
            double time = Double.parseDouble(LocalTime.now().format(DateTimeFormatter.ofPattern("HH.mm")));
            double shiftDuration = time - this.currentShiftTime;
            this.hoursWorked += shiftDuration;
            this.currentShiftTime = 0;
        } else {
            System.out.println("Employee hasn't punched in");
        }
    }

    public void punchTimeCard() {
        while (true) {
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Are you punching (in) or (out)? ('X' to exit program ): ");
            String userInput = keyboard.nextLine().toLowerCase();

            switch (userInput) {
                case "in":
                    System.out.print("Please enter time in (ex. 9.0 for 9AM): ");
                    this.currentShiftTime = Double.parseDouble(keyboard.nextLine());
                    System.out.println("""
                            Employee time punched in successfully!
                            Returning to main menu..
                            ---------------""");
                    break;
                case "out":
                    if (this.currentShiftTime > 0) {
                        System.out.print("Please enter time out (ex. 17.0 for 5PM): ");
                        double shiftDuration = Double.parseDouble(keyboard.nextLine()) - this.currentShiftTime;
                        this.hoursWorked += shiftDuration;
                        this.currentShiftTime = 0;
                        System.out.println("""
                                Employee time punched out successfully!
                                Returning to main menu..
                                ---------------""");
                        break;
                    } else {
                        System.out.println("Employee hasn't punched in");
                    }
                case "x":
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Error: Invalid input. please try again!");
            }
        }

    }

}
