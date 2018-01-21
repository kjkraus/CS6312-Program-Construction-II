package edu.westga.cs6312.locks.testing.dial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.locks.model.Dial;

class TestDecrementValue {
    
    /**
     * Test to confirm decrementing a new Dial will produce
     *  a current value of 9
     */
    @Test
    public void testDecrementNewDialShouldGiveValue9() {
        Dial testDial = new Dial();
        testDial.decrement();
        int value = testDial.getValue();
        assertEquals(9, value);
    }
    
    /**
     * Test to confirm decrementing a Dial from 5 will produce
     *  a current value of 4
     */
    @Test
    public void testDecrementDialAt5ShouldGiveValue4() {
        Dial testDial = new Dial();
        for (int count = 0; count < 5; count++) {
            testDial.increment();
        }
        
        testDial.decrement();
        int value = testDial.getValue();
        assertEquals(4, value);
    }
    
    /**
     * Test to confirm decrementing a Dial from 9 will produce
     *  a current value of 8
     */
    @Test
    public void testDecrementDialAt9ShouldGiveValue8() {
        Dial testDial = new Dial();
        for (int count = 0; count < 9; count++) {
            testDial.increment();
        }
        
        testDial.decrement();
        int value = testDial.getValue();
        assertEquals(8, value);
    }
    
    /**
     * Test to confirm decrementing a Dial 17 times will produce
     *  a current value of 3
     */
    @Test
    public void testDecrementDial17TimesShouldGiveValue3() {
        Dial testDial = new Dial();
        for (int count = 0; count < 17; count++) {
            testDial.decrement();
        }
        
        int value = testDial.getValue();
        assertEquals(3, value);
    }
}
