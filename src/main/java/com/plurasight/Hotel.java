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
        boolean result = true;

        if ((this.numberOfSuites > 0 && isSuite)) {
            this.bookedSuites += 1;
        } else if (this.numberOfRooms > 0 && !isSuite) {
            this.bookedBasicRooms += 1;
        }else {
            result = false;
        }
        return result;
    }

    public int getAvailableSuites() {
        return getNumberOfSuites() - getBookedSuites();
    }

    public int getAvailableRooms() {
        return getNumberOfRooms() - getBookedBasicRooms();
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }



}
