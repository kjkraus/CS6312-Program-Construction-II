package edu.westga.cs6312.locks.testing.bikelock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.locks.model.BikeLock;

class TestDecrementLockDials {

    /**
     * Test to confirm decrementing all Dials of a new BikeLock once will produce
     *  a displayed value of 9999
     */
    @Test
    public void testDecrementAllDialsOnceShouldDisplayValue9999() {
        BikeLock theLock = new BikeLock();
        theLock.decrementDial(0, 1);
        theLock.decrementDial(1, 1);
        theLock.decrementDial(2, 1);
        theLock.decrementDial(3, 1); 
        assertEquals("BikeLock with combination 1234 that's currently showing 9999",
            	theLock.toString());
    }
    
    /**
     * Test to confirm decrementing all Dials of a new BikeLock nine times will produce
     *  a displayed value of 1111
     */
    @Test
    public void testDecrementAllDialsSNineTimeshouldDisplayValue1111() {
        BikeLock theLock = new BikeLock();
        theLock.decrementDial(0, 9);
        theLock.decrementDial(1, 9);
        theLock.decrementDial(2, 9);
        theLock.decrementDial(3, 9); 
        assertEquals("BikeLock with combination 1234 that's currently showing 1111",
            	theLock.toString());
    }
    
    /**
     * Test to confirm decrementing all Dials of a new BikeLock four times will produce
     *  a displayed value of 6666
     */
    @Test
    public void testDecrementAllDialsSFourTimeshouldDisplayValue6666() {
        BikeLock theLock = new BikeLock();
        theLock.decrementDial(0, 4);
        theLock.decrementDial(1, 4);
        theLock.decrementDial(2, 4);
        theLock.decrementDial(3, 4); 
        assertEquals("BikeLock with combination 1234 that's currently showing 6666",
            	theLock.toString());
    }
    
    /**
     * Test to confirm decrementing two middle Dials of a new BikeLock two times will produce
     *  a displayed value of 0880
     */
    @Test
    public void testDecrementMiddleDialsSTwoTimeshouldDisplayValue0880() {
        BikeLock theLock = new BikeLock();
        theLock.decrementDial(1, 2);
        theLock.decrementDial(2, 2);
        assertEquals("BikeLock with combination 1234 that's currently showing 0880",
            	theLock.toString());
    }
    
    /**
     * Test to confirm decrementing two outer Dials of a new BikeLock six times will produce
     *  a displayed value of 4004
     */
    @Test
    public void testDecrementOuterDialsSSixTimeshouldDisplayValue4004() {
        BikeLock theLock = new BikeLock();
        theLock.decrementDial(0, 6);
        theLock.decrementDial(3, 6);
        assertEquals("BikeLock with combination 1234 that's currently showing 4004",
            	theLock.toString());
    }
    
    /**
     * Test to confirm decrementing the third Dial of a new BikeLock twelve times will produce
     *  a displayed value of 0080
     */
    @Test
    public void testDecrementThirdDialTwelveTimeshouldDisplayValue0080() {
        BikeLock theLock = new BikeLock();
        theLock.decrementDial(2, 12);
        assertEquals("BikeLock with combination 1234 that's currently showing 0080",
            	theLock.toString());
    }
    
    /**
     * Test to confirm decrementing the all Dials of a new BikeLock fifteen times will produce
     *  a displayed value of 5555
     */
    @Test
    public void testDecrementAllDialsFifteenTimeshouldDisplayValue5555() {
        BikeLock theLock = new BikeLock();
        theLock.decrementDial(0, 15);
        theLock.decrementDial(1, 15);
        theLock.decrementDial(2, 15);
        theLock.decrementDial(3, 15);
        assertEquals("BikeLock with combination 1234 that's currently showing 5555",
            	theLock.toString());
    }

}
