package edu.westga.cs6312.polymorphism.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.polymorphism.model.Lion;
import edu.westga.cs6312.polymorphism.model.Owl;
import edu.westga.cs6312.polymorphism.model.Parrot;
import edu.westga.cs6312.polymorphism.model.Wolf;

class TestGetNewAnimal {
    
    /**
     * This tests getNewAnimal for animal kind of lion
     */
    @Test
    public void testGetNewAnimalShouldBeLionWithHair() {
        Lion theLion = new Lion();
        String theNewAnimalDescription = Lion.getNewAnimal("lion").toString();
        assertEquals(theNewAnimalDescription, theLion.toString());
    }
    
    /**
     * This tests getNewAnimal for animal kind of wolf
     */
    @Test
    public void testGetNewAnimalShouldBeWolfWithHair() {
        Wolf theWolf = new Wolf();
        String theNewAnimalDescription = Wolf.getNewAnimal("wolf").toString();
        assertEquals(theNewAnimalDescription, theWolf.toString());
    }
    
    /**
     * This tests getNewAnimal for animal kind of owl
     */
    @Test
    public void testGetNewAnimalShouldBeOwlWithFeathers() {
        Owl theOwl = new Owl();
        String theNewAnimalDescription = Owl.getNewAnimal("owl").toString();
        assertEquals(theNewAnimalDescription, theOwl.toString());
    }
    
    /**
     * This tests getNewAnimal for animal kind of parrot
     */
    @Test
    public void testGetNewAnimalShouldBeParrotWithFeathers() {
        Parrot theParrot = new Parrot();
        String theNewAnimalDescription = Parrot.getNewAnimal("parrot").toString();
        assertEquals(theNewAnimalDescription, theParrot.toString());
    }
}
