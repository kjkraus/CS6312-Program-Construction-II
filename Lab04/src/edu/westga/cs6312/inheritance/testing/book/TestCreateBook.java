package edu.westga.cs6312.inheritance.testing.book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.inheritance.model.Book;

class TestCreateBook {
    
    /**
     * Test to see if 2-parameter constructor creates Book
     *  with title Paradise Lost and number of pages 549
     */
    @Test
    public void test2ParameterConstructorShouldHaveTitleParadiseLostAndPage549() {
    	Book theBook = new Book("Paradise Lost", 549);
    	assertEquals("A book named Paradise Lost with 549 pages", theBook.toString());
    }
    
    /**
     * Test to see if 2-parameter constructor creates Book
     *  with title Leaves of Grass and number of pages 321
     */
    @Test
    public void test2ParameterConstructorShouldHaveTitleLeavesOfGrassAndPage321() {
    	Book theBook = new Book("Leaves of Grass", 321);
    	assertEquals("A book named Leaves of Grass with 321 pages", theBook.toString());
    }

}
