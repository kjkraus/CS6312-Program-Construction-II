package edu.westga.cs6312.locks.testing.bikelock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.locks.model.BikeLock;

class TestBikeLockIsLockOpen {

    /**
     *Test to be sure a BikeLock with combination 0000 
     * and display of 0000 will be an open lock
     */
    @Test
    public void testCombination0000AndShow0000IsLockOpen() {
        BikeLock theLock = new BikeLock(0, 0, 0, 0);
        assertEquals(true, theLock.isOpen());
    }
    
    /**
     * Test to be sure a BikeLock with combination 9999 
     * and display of 9999 will be an open lock
     */
    @Test
    public void testCombination9999AndShow9999IsLockOpen() {
        BikeLock theLock = new BikeLock(9, 9, 9, 9);
        theLock.incrementDial(0, 9);
        theLock.incrementDial(1, 9);
        theLock.incrementDial(2, 9);
        theLock.incrementDial(3, 9);
        assertEquals(true, theLock.isOpen());
    }
    
    /**
     * Test to be sure a BikeLock with combination 8282 
     * and display of 8282 will be an open lock
     */
    @Test
    public void testCombination8282AndShow8282IsLockOpen() {
        BikeLock theLock = new BikeLock(8, 2, 8, 2);
        theLock.incrementDial(0, 8);
        theLock.incrementDial(1, 2);
        theLock.incrementDial(2, 8);
        theLock.incrementDial(3, 2);
        assertEquals(true, theLock.isOpen());
    }
    
    /**
     * Test to be sure a BikeLock with combination 0000 
     * and display of 9999 will NOT be an open lock
     */
    @Test
    public void testCombination0000AndShow9999IsLockOpen() {
        BikeLock theLock = new BikeLock(0, 0, 0, 0);
        theLock.incrementDial(0, 9);
        theLock.incrementDial(1, 9);
        theLock.incrementDial(2, 9);
        theLock.incrementDial(3, 9);
        assertEquals(false, theLock.isOpen());
    }
    
    /**
     * Test to be sure a BikeLock with combination 9999 
     * and display of 0000 will NOT be an open lock
     */
    @Test
    public void testCombination9999AndShow0000IsLockOpen() {
        BikeLock theLock = new BikeLock(9, 9, 9, 9);
        assertEquals(false, theLock.isOpen());
    }
    
    /**
     * Test to be sure a BikeLock with combination 5335 
     * and display of 3553 will NOT be an open lock
     */
    @Test
    public void testCombination5335AndShow3553IsLockOpen() {
        BikeLock theLock = new BikeLock(5, 3, 3, 5);
        theLock.incrementDial(0, 3);
        theLock.incrementDial(1, 5);
        theLock.incrementDial(2, 5);
        theLock.incrementDial(3, 3);
        assertEquals(false, theLock.isOpen());
    }
}
