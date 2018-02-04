package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.polymorphism.model.Parrot;

class TestParrot {

    /**
     * Test to see if 0-parameter constructor creates a animal
     *  with kind parrot and kind of covering feathers
     */
    @Test
    public void test0ParameterConstructorShouldBeParrotWithFeathers() {
        Parrot theParrot = new Parrot();
        assertEquals("This animal is a parrot that is covered with feathers", 
        	theParrot.toString());
    }
    
    /**
     * Test to see if the correct sound is returned for an parrot
     */
    @Test
    public void testNewParrotShouldHaveSoundOfSquawk() {
    	Parrot theParrot = new Parrot();
        assertEquals("squawk", theParrot.getSound());
    }
    
    /**
     * Test to see if the correct description is returned for 
     *  a fast moving parrot
     */
    @Test
    public void testFastParrotShouldFly() {
    	Parrot theParrot = new Parrot();
    	assertEquals("I fly", theParrot.getMovement(true));
    }
    
    /**
     * Test to see if the correct description is returned for 
     *  a slow moving parrot
     */
    @Test
    public void testSlowParrotShouldWalkOnTwoLegs() {
        Parrot theParrot = new Parrot();
        assertEquals("I walk on two legs", theParrot.getMovement(false));
    }
}
