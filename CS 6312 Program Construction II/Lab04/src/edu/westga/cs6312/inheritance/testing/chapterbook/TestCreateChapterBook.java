package edu.westga.cs6312.inheritance.testing.chapterbook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.inheritance.model.ChapterBook;

class TestCreateChapterBook {

    /**
     * Test to see if 2-parameter constructor creates ChapterBook
     *  with title The Bible, number of pages 7,999, and 
     *  the default number of chapters (1)
     */
    @Test
    public void test2ParameterConstructorShouldHaveTitleTheBibleAndPage7999And1Chapter() {
    	ChapterBook theChapterBook = new ChapterBook("The Bible", 7999);
    	assertEquals("A book named The Bible with 7999 pages and 1 chapters", theChapterBook.toString());
    }
    
    /**
     * Test to see if 3-parameter constructor creates ChapterBook
     *  with title The Talmud, number of pages 3999, and 
     *  the number of chapters 129
     */
    @Test
    public void test3ParameterConstructorShouldHaveTitleTheTalmudAndPage3999And129Chapters() {
    	ChapterBook theChapterBook = new ChapterBook("The Talmud", 3999, 1299);
    	assertEquals("A book named The Talmud with 3999 pages and 1299 chapters", theChapterBook.toString());
    }

}
