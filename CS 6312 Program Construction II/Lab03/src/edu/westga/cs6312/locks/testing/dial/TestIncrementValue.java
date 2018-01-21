package edu.westga.cs6312.locks.testing.dial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.locks.model.Dial;

class TestIncrementValue {
    
    /**
     * Test to confirm incrementing a new Dial will produce
     *  a current value of 1
     */
    @Test
    public void testIncrementNewDialShouldGiveValue1() {
        Dial testDial = new Dial();
        testDial.increment();
        int value = testDial.getValue();
        assertEquals(1, value);
    }
    
    /**
     * Test to confirm incrementing a Dial from 5 will produce
     *  a current value of 6
     */
    @Test
    public void testIncrementDialAt5ShouldGiveValue6() {
        Dial testDial = new Dial();
        for (int count = 0; count < 5; count++) {
            testDial.increment();
        }
        
        testDial.increment();
        int value = testDial.getValue();
        assertEquals(6, value);
    }
    
    /**
     * Test to confirm incrementing a Dial from 9 will produce
     *  a current value of 0
     */
    @Test
    public void testIncrementDialAt9ShouldGiveValue0() {
        Dial testDial = new Dial();
        for (int count = 0; count < 9; count++) {
            testDial.increment();
        }
        
        testDial.increment();
        int value = testDial.getValue();
        assertEquals(0, value);
    }
    
    /**
     * Test to confirm incrementing a Dial 12 times will produce
     *  a current value of 3
     */
    @Test
    public void testIncrementDial12TimesShouldGiveValue3() {
        Dial testDial = new Dial();
        for (int count = 0; count < 12; count++) {
            testDial.increment();
        }
        
        int value = testDial.getValue();
        assertEquals(2, value);
    }
}
