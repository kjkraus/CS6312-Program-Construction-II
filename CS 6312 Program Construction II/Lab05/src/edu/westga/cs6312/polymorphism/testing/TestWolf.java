package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.polymorphism.model.Wolf;

class TestWolf {

    /**
     * Test to see if 0-parameter constructor creates a animal
     *  with kind wolf and kind of covering hair
     */
    @Test
    public void test0ParameterConstructorShouldBeWolfWithHair() {
        Wolf theWolf = new Wolf();
        assertEquals("This animal is a wolf that is covered with hair", 
        	theWolf.toString());
    }
    
    /**
     * Test to see if the correct sound is returned for a wolf
     */
    @Test
    public void testNewWolfShouldHaveSoundOfHowl() {
    	Wolf theWolf = new Wolf();
        assertEquals("howl", theWolf.getSound());
    }
    
    /**
     * Test to see if the correct description is returned for 
     *  a fast moving wolf
     */
    @Test
    public void testFastWolfShouldRunOnFourLegs() {
    	Wolf theWolf = new Wolf();
    	assertEquals("I run on four legs", theWolf.getMovement(true));
    }
    
    /**
     * Test to see if the correct description is returned for 
     *  a slow moving wolf
     */
    @Test
    public void testSlowWolfShouldWalkOnFourLegs() {
    	Wolf theWolf = new Wolf();
        assertEquals("I walk on four legs", theWolf.getMovement(false));
    } 
}
