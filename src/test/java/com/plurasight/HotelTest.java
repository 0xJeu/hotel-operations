package com.plurasight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void bookRoom() {
        //arrange
        Hotel testHotel = new Hotel("Jeudy", 20, 15);
        //act
        boolean result =  testHotel.bookRoom(10, true);

        //assert
        assertTrue(result);
    }

    @Test
    void bookRoomFails() {
        //arrange
        Hotel testHotel = new Hotel("Jeudy", 15, 5);

        //act
        boolean result =  testHotel.bookRoom(10, false);

        //assert
        assertFalse(result);
    }
}