package edu.westga.cs6312.locks.testing.bikelock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.locks.model.BikeLock;

class TestCreateBikeLock {

    /**
     * Test to be sure the BikeLock's 0-parameter constructor will
     *  correctly create a lock with combination 1234 and have four dials
     *  each showing the value 0 (for a current display of 0000)
     */
    @Test
    public void test0ParameterConstructorShouldHaveCombination1234AndShow0000() {
        BikeLock theLock = new BikeLock();
        assertEquals("BikeLock with combination 1234 that's currently showing 0000",
        	theLock.toString());
    }
    
    /**
     * Test to be sure the BikeLock's 4-parameter constructor will
     *  correctly create a lock with combination 0000 and have four dials
     *  each showing the value 0 (for a current display of 0000)
     */
    @Test
    public void test4ParameterConstructorShouldHaveCombination0000AndShow0000() {
        BikeLock theLock = new BikeLock(0, 0, 0, 0);
        assertEquals("BikeLock with combination 0000 that's currently showing 0000",
        	theLock.toString());
    }
    
    /**
     * Test to be sure the BikeLock's 4-parameter constructor will
     *  correctly create a lock with combination 9999 and have four dials
     *  each showing the value 0 (for a current display of 0000)
     */
    @Test
    public void test4ParameterConstructorShouldHaveCombination9999AndShow0000() {
        BikeLock theLock = new BikeLock(9, 9, 9, 9);
        assertEquals("BikeLock with combination 9999 that's currently showing 0000",
        	theLock.toString());
    }
    
    /**
     * Test to be sure the BikeLock's 4-parameter constructor will
     *  correctly create a lock with combination 7654 and have four dials
     *  each showing the value 0 (for a current display of 0000)
     */
    @Test
    public void test4ParameterConstructorShouldHaveCombination7654AndShow0000() {
        BikeLock theLock = new BikeLock(7, 6, 5, 4);
        assertEquals("BikeLock with combination 7654 that's currently showing 0000",
        	theLock.toString());
    }

}
