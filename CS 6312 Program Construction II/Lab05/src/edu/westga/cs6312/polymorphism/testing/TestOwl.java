package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.polymorphism.model.Owl;


class TestOwl {

    /**
     * Test to see if 0-parameter constructor creates a animal
     *  with kind owl and kind of covering feathers
     */
    @Test
    public void test0ParameterConstructorShouldBeOwlWithFeathers() {
        Owl theOwl = new Owl();
        assertEquals("This animal is a owl that is covered with feathers", 
        	theOwl.toString());
    }
    
    /**
     * Test to see if the correct sound is returned for an owl
     */
    @Test
    public void testNewOwlShouldHaveSoundOfHooHoo() {
    	Owl theOwl = new Owl();
        assertEquals("hoo hoo", theOwl.getSound());
    }
    
    /**
     * Test to see if the correct description is returned for 
     *  a fast moving owl
     */
    @Test
    public void testFastOwlShouldFly() {
    	Owl theOwl = new Owl();
    	assertEquals("I fly", theOwl.getMovement(true));
    }
    
    /**
     * Test to see if the correct description is returned for 
     *  a slow moving owl
     */
    @Test
    public void testSlowOwlShouldWalkOnTwoLegs() {
    	Owl theOwl = new Owl();
        assertEquals("I walk on two legs", theOwl.getMovement(false));
    }
}
