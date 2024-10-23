package com.plurasight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkInPasses() {
        //arrangement
        Room testRoom = new Room(2, 35.75, false, false);

        //act
        testRoom.checkIn();

        //assert
        assertTrue(testRoom.roomOccupied);
        assertTrue(testRoom.roomDirty);
    }

    @Test
    void checkInFailsDueToRoomDirty() {
        //arrangement
        Room testRoom = new Room(2, 35.75, false, true);

        //act
        testRoom.checkIn();

        //assert
        assertFalse(testRoom.isAvailable());
        assertTrue(testRoom.isDirty());
        assertFalse(testRoom.isOccupied());
    }

    @Test
    void checkOut() {
        //arrangement
        Room testRoom = new Room(2, 35.75, true, true);

        //act
        testRoom.checkOut();

        //assert
        assertFalse(testRoom.isOccupied());
        assertTrue(testRoom.isDirty());
    }

    @Test
    void cleanRoom() {
        //arrangement
        Room testRoom = new Room(2, 35.75, false, true);

        //act
        testRoom.cleanRoom();

        //assert
        assertFalse(testRoom.isDirty());

    }

    @Test
    void cleanRoomFailsDueToRoomOccupied() {
        //arrange
        Room testRoom = new Room(2, 35.75, true, true);

        //act
        testRoom.cleanRoom();

        //assert
        assertTrue(testRoom.isOccupied());
    }

}