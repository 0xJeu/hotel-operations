package com.plurasight;

public class App {
    public static void main(String[] args) {
        Room room = new Room(3, 60.0, false, true);
        Reservation reservation = new Reservation("Junior Suite", 80.75, 4, false);
        Employee employee = new Employee(55342, "Stephane", "HR", 35.00, 0);


//        employee.punchIn();
//        System.out.println(employee.currentShiftTime);
//        employee.punchOut();
//        System.out.println(employee.hoursWorked);
//        System.out.println(employee.getTotalPay());

        Hotel hotel = new Hotel("The Jeudy Hotel", 12, 50, 12, 50);

        System.out.println(hotel.bookRoom(2, false));

    }
}
