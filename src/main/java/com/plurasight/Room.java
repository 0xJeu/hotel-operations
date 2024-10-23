package com.plurasight;

public class Room {
    int numberOfBeds;
    double price;
    boolean roomOccupied, roomDirty;

    public Room(int numberOfBeds, double price, boolean roomOccupied, boolean roomDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.roomOccupied = roomOccupied;
        this.roomDirty = roomDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return roomOccupied;
    }

    public boolean isDirty() {
        return roomDirty;
    }

    public boolean isAvailable() {
        return !this.roomOccupied && !this.roomDirty;
    }

    public void checkIn() {
        if (this.isAvailable()) {
            this.roomDirty = true;
            this.roomOccupied = true;
        } else {
            System.out.println("Sorry, this room is not available");
        }

    }

    public void checkOut() {
        this.roomOccupied = false;
    }

    public void cleanRoom() {
        this.roomDirty = false;
    }


}
