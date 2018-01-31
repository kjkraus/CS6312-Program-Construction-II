package edu.westga.cs6312.inheritance.testing.book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.inheritance.model.Book;

class TestBookTitle {

    /**
     * Test to get the title of the book when the book is 
     *  Heart of Darkness
     */
    @Test
    public void testGetTitleOfBookForHeartOfDarkness() {
    	Book theBook = new Book("Heart of Darkness", 455);
    	assertEquals("Heart of Darkness", theBook.getTitle());
    }
    
    /**
     * Test to get the title of the book when the book is
     *  Anna Karenina
     */
    @Test
    public void testGetTitleOfBookForAnnaKarenina() {
    	Book theBook = new Book("Anna Karenina", 232);
    	assertEquals("Anna Karenina", theBook.getTitle());
    }
    
    /**
     * Test to set the title of the book to 
     *  The Great Gatsby
     */
    @Test
    public void testSetTitleOfBookToTheGreatGatsby() {
    	Book theBook = new Book("The Sun Also Rises", 200);
    	theBook.setTitle("The Great Gatsby");
    	assertEquals("The Great Gatsby", theBook.getTitle());
    }
    
    /**
     * Test to set the title of the book to
     *  Ulysses
     */
    @Test
    public void testSetTitleOfBookToUlysses() {
    	Book theBook = new Book("Don Quixote", 400);
    	theBook.setTitle("Ulysses");
    	assertEquals("Ulysses", theBook.getTitle());
    }

}
