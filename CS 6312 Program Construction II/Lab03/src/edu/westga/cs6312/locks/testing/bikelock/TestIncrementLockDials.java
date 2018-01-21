package edu.westga.cs6312.locks.testing.bikelock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.locks.model.BikeLock;


class TestIncrementLockDials {

    /**
     * Test to confirm incrementing all Dials of a new BikeLock once will produce
     *  a displayed value of 1111
     */
    @Test
    public void testIncrementAllDialsShouldDisplayValue1111() {
        BikeLock theLock = new BikeLock();
        theLock.incrementDial(0, 1);
        theLock.incrementDial(1, 1);
        theLock.incrementDial(2, 1);
        theLock.incrementDial(3, 1); 
        assertEquals("BikeLock with combination 1234 that's currently showing 1111",
            	theLock.toString());
    }
    
    /**
     * Test to confirm incrementing all Dials of a new BikeLock nine times will produce
     *  a displayed value of 9999
     */
    @Test
    public void testIncrementAllDialsSNineTimeshouldDisplayValue9999() {
        BikeLock theLock = new BikeLock();
        theLock.incrementDial(0, 9);
        theLock.incrementDial(1, 9);
        theLock.incrementDial(2, 9);
        theLock.incrementDial(3, 9); 
        assertEquals("BikeLock with combination 1234 that's currently showing 9999",
            	theLock.toString());
    }
    
    /**
     * Test to confirm incrementing all Dials of a new BikeLock four times will produce
     *  a displayed value of 4444
     */
    @Test
    public void testIncrementAllDialsSFourTimeshouldDisplayValue4444() {
        BikeLock theLock = new BikeLock();
        theLock.incrementDial(0, 4);
        theLock.incrementDial(1, 4);
        theLock.incrementDial(2, 4);
        theLock.incrementDial(3, 4); 
        assertEquals("BikeLock with combination 1234 that's currently showing 4444",
            	theLock.toString());
    }
    
    /**
     * Test to confirm incrementing two middle Dials of a new BikeLock two times will produce
     *  a displayed value of 0220
     */
    @Test
    public void testIncrementMiddleDialsSTwoTimeshouldDisplayValue0220() {
        BikeLock theLock = new BikeLock();
        theLock.incrementDial(1, 2);
        theLock.incrementDial(2, 2);
        assertEquals("BikeLock with combination 1234 that's currently showing 0220",
            	theLock.toString());
    }
    
    /**
     * Test to confirm incrementing two outer Dials of a new BikeLock six times will produce
     *  a displayed value of 6006
     */
    @Test
    public void testIncrementOuterDialsSSixTimeshouldDisplayValue6006() {
        BikeLock theLock = new BikeLock();
        theLock.incrementDial(0, 6);
        theLock.incrementDial(3, 6);
        assertEquals("BikeLock with combination 1234 that's currently showing 6006",
            	theLock.toString());
    }
    
    /**
     * Test to confirm incrementing the third Dial of a new BikeLock twelve times will produce
     *  a displayed value of 0020
     */
    @Test
    public void testIncrementThirdDialTwelveTimeshouldDisplayValue0020() {
        BikeLock theLock = new BikeLock();
        theLock.incrementDial(2, 12);
        assertEquals("BikeLock with combination 1234 that's currently showing 0020",
            	theLock.toString());
    }
    
    /**
     * Test to confirm incrementing the all Dials of a new BikeLock fifteen times will produce
     *  a displayed value of 5555
     */
    @Test
    public void testIncrementAllDialsFifteenTimeshouldDisplayValue5555() {
        BikeLock theLock = new BikeLock();
        theLock.incrementDial(0, 15);
        theLock.incrementDial(1, 15);
        theLock.incrementDial(2, 15);
        theLock.incrementDial(3, 15);
        assertEquals("BikeLock with combination 1234 that's currently showing 5555",
            	theLock.toString());
    }

}
