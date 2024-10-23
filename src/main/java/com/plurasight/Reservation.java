package com.plurasight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekendStay;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekendStay) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekendStay = weekendStay;
    }

    //Getters
    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    //Setters
    public void setRoomType(String roomType) {
        this.roomType = roomType;

        double weekendFactor = (this.weekendStay) ? 1.1 : 1;

        if (roomType.equalsIgnoreCase("king")) {
            this.price = 139.00 * weekendFactor;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.price = 124.00 * weekendFactor;
        }
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    //Boolean Getter
    public boolean isWeekend() {
        return weekendStay;
    }

    //Boolean Setter
    public void setIsWeekend(boolean weekendStay) {
        this.weekendStay = weekendStay;
    }

    public double getReservationTotal() {
        return this.price * this.numberOfNights;
    }
}
