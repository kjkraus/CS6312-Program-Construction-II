package edu.westga.cs6312.inheritance.testing.book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.inheritance.model.Book;

class TestBookPages {

    /**
     * Test to get the number of pages when the book has 999 pages
     */
    @Test
    public void testGetNumberOfPagesForBookWith999() {
    	Book theBook = new Book("Frankenstein", 999);
    	assertEquals(999, theBook.getPages());
    }
    
    /**
     * Test to get the number of pages when the book has 1 page
     */
    @Test
    public void testGetNumberOfPagesForBookWith1() {
    	Book theBook = new Book("The Counte of Monte Cristo", 1);
    	assertEquals(1, theBook.getPages());
    }
    
    /**
     * Test to set the the number of pages of the book to 599
     */
    @Test
    public void testSetNumberOfPagesTo599() {
    	Book theBook = new Book("David Copperfield", 771);
    	theBook.setPages(599);
    	assertEquals(599, theBook.getPages());
    }
    
    /**
     * Test to set the the number of pages of the book to 9999
     */
    @Test
    public void testSetNumberOfPagesTo9999() {
    	Book theBook = new Book("Jane Eyre", 333);
    	theBook.setPages(9999);
    	assertEquals(9999, theBook.getPages());
    }

}
