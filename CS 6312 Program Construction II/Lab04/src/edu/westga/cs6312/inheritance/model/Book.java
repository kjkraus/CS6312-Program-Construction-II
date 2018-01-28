package edu.westga.cs6312.inheritance.model;

/**
 * This class will model a Book and track the book's title and number of pages 
 * 
 * @author Kent Kraus
 * @version 2018-01-28
 */
public class Book {
    private String titleOfBook;
    private int pagesInBook;
    
    /**
     * Initializes a new Book object and tile and number of pages
     *  of the corresponding parameters
     *  
     *  @param title  The title of the book
     *  @param pages The number of pages of the book
     */
    public Book(String title, int pages) {
        this.titleOfBook = title;
        this.pagesInBook = pages;
	
    }
    
    @Override
    public String toString() {
    	return "A book named " + this.titleOfBook + " with " + this.pagesInBook + " pages";
    }
    
    /**
     * Accessor for the title of the book
     * 
     * @return the titleofBook;
     */
    public String getTitle() {
        return this.titleOfBook;
    }

    /**
     * Mutator to set the title of the book
     * 
     * @param title	 the title to set
     */
    public void setTitle(String title) {
        this.titleOfBook = title;
    }

    /**
     * Accessor for the number of pages in the book
     * 
     * @return the number of pages in the book
     */
    public int getPages() {
        return this.pagesInBook;
    }

    /**
     * Mutator to set the number of pages in the book
     * 
     * @param pages	the number of pages to set
     */
    public void setPages(int pages) {
        this.pagesInBook = pages;
    }

}
