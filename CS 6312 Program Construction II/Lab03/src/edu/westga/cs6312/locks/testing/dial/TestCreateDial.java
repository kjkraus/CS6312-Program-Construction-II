package edu.westga.cs6312.locks.testing.dial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.locks.model.Dial;

class TestCreateDial {
    
    /**
     * Test to see if the 0-parameter constructor creates
     *  a Dial with the current value 0
     */
    @Test
    public void testGetValue() {
    	Dial newDial = new Dial();
    	int value = newDial.getValue();
    	assertEquals(0, value);
    }
}
