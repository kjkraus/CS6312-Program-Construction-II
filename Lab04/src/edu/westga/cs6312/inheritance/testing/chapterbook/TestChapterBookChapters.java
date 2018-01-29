package edu.westga.cs6312.inheritance.testing.chapterbook;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import edu.westga.cs6312.inheritance.model.ChapterBook;

class TestChapterBookChapters {

    /**
     * Test to get the number of chapters when the chapterbook has default 
     *  (1) chapters
     */
    @Test
    public void testGetNumberOfChaptersForChapterBookWith1() {
    	ChapterBook theChapterBook = new ChapterBook("Out of Africa", 2999);
    	assertEquals(1, theChapterBook.getChapters());
    }
    
    /**
     * Test to get the number of chapters when the chapterbook has 
     *  8888 chapters
     */
    @Test
    public void testGetNumberOfChaptersForChapterBookWith8888() {
    	ChapterBook theChapterBook = new ChapterBook("Old Town", 55000, 8888);
    	assertEquals(8888, theChapterBook.getChapters());
    }
    
    /**
     * Test to set the number of chapters when the chapterbook has 
     *  899,999 chapters
     */
    @Test
    public void testSetNumberOfChaptersForChapterBookTo899999() {
    	ChapterBook theChapterBook = new ChapterBook("Canterbury Tales", 6999, 2000);
    	theChapterBook.setChapters(899999);
    	assertEquals(899999, theChapterBook.getChapters());
    }
    
    /**
     * Test to set the number of chapters when the chapterbook has 
     *  11 chapters
     */
    @Test
    public void testSetNumberOfChaptersForChapterBookTo11() {
    	ChapterBook theChapterBook = new ChapterBook("Winters Bone", 301, 9999);
    	theChapterBook.setChapters(11);
    	assertEquals(11, theChapterBook.getChapters());
    }

}
