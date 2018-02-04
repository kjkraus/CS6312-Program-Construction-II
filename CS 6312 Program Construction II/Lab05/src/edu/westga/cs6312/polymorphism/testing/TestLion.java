package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.polymorphism.model.Lion;

class TestLion {

    /**
     * Test to see if 0-parameter constructor creates a animal
     *  with kind lion and kind of covering hair
     */
    @Test
    public void test0ParameterConstructorShouldBeLionWithHair() {
        Lion theLion = new Lion();
        assertEquals("This animal is a lion that is covered with hair", 
        	theLion.toString());
    }
    
    /**
     * Test to see if the correct sound is returned for a lion
     */
    @Test
    public void testNewLionShouldHaveSoundOfRoar() {
        Lion theLion = new Lion();
        assertEquals("roar", theLion.getSound());
    }
    
    /**
     * Test to see if the correct description is returned for 
     *  a fast moving lion
     */
    @Test
    public void testFastLionShouldRunOnFourLegs() {
        Lion theLion = new Lion();
        assertEquals("I run on four legs", theLion.getMovement(true));
    }
    
    /**
     * Test to see if the correct description is returned for 
     *  a slow moving lion
     */
    @Test
    public void testSlowLionShouldWalkOnFourLegs() {
        Lion theLion = new Lion();
        assertEquals("I walk on four legs", theLion.getMovement(false));
    }        
}
