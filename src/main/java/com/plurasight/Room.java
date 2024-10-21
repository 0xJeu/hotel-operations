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
        return !isOccupied() && !isDirty();
    }

}
