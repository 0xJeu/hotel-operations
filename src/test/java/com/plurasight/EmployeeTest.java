package com.plurasight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        //arrange
        Employee testEmployee = new Employee(12342, "Joe", "HR", 22.50, 26.0);
        //act
        testEmployee.punchIn(15.0);
        //assert
        assertEquals(15.0, testEmployee.currentShiftTime);
    }

    @Test
    void punchOut() {
        //arrange
        Employee testEmployee = new Employee(12342, "Joe", "HR", 22.50, 0);

        //act
        testEmployee.punchIn(9.0);
        testEmployee.punchOut(17.0);

        //assert
        assertEquals(8, testEmployee.getRegularHours());
    }
}