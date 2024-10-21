package com.plurasight;

public class App {
    public static void main(String[] args) {
        Room room = new Room(3, 60.0, false, true);
        Reservation reservation = new Reservation("Junior Suite", 80.75, 4, false);
        Employee employee = new Employee(55342, "Stephane", "HR", 35.00, 54.00);

        reservation.setRoomType("king");
        System.out.println(reservation.getPrice());

    }
}
