package com.plurasight;

public class App {
    public static void main(String[] args) {
        Room room = new Room(3, 60.0, false, true);
        Reservation reservation = new Reservation("Junior Suite", 80.75, 4, false);
        Employee employee = new Employee(55342, "Stephane", "HR", 35.00, 0);


        employee.punchTimeCard();
        System.out.println(employee.hoursWorked);
        System.out.println(employee.currentShiftTime);
        System.out.println(employee.getTotalPay());

    }
}
