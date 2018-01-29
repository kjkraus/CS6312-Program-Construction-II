package edu.westga.cs6312.inheritance.model;

/**
 * This class models a ChapterBook and tracks the number of chapters
 * 
 * @author Kent Kraus
 * @version 2018-01-28
 */
public class ChapterBook extends Book {
    private int numberOfChapters;
    
    /**
     * Initializes a ChapterBook object with title and pages
     *  of the corresponding parameters
     *  
     *  @param title	 The tile of the ChapterBook
     *  @param pages	 The number of pages in the ChapterBook
     */
    public ChapterBook(String title, int pages) {
        super(title, pages);
        this.numberOfChapters = 1;
    }
    
    /**
     * Initializes a ChapterBook object with the title, pages, 
     *  and number of chapters of the corresponding parameters
     *  
     *  @param title	The title of the ChapterBook
     *  @param pages 	The number of pages in the ChapterBook
     *  @param chapters The number of chapters in the ChapterBook
     */
    public ChapterBook(String title, int pages, int chapters) {
        super(title, pages);
        this.numberOfChapters = chapters;
    }
    
    @Override
    public String toString() {
    	
    	return super.toString() + " and " + this.numberOfChapters + " chapters";
    }
    
    /**
     * Accessor for the number of chapters in the ChapterBook
     * 
     * @return the number of chapters in the ChapterBook
     */
    public int getChapters() {
        return this.numberOfChapters;
    }

    /**
     * Mutator to set the number of chapters in the ChapterBook
     * 
     * @param chapters	the number of chapters to set
     */
    public void setChapters(int chapters) {
        this.numberOfChapters = chapters;
    }
}
