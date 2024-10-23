package com.plurasight;

public class Hotel {
    private String name;
    private int bookedSuites, numberOfRooms, numberOfSuites, bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        boolean result = false;

        if ((getAvailableSuites() >= numberOfRooms && isSuite)) {
            this.bookedSuites += numberOfRooms;
            result = true;
        } else if (getAvailableRooms() >= numberOfRooms && !isSuite) {
            this.bookedBasicRooms += numberOfRooms;
            result = true;
        }
        return result;
    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }
}

