package edu.westga.cs6312.inheritance.testing.dictionary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.inheritance.model.Dictionary;

class TestCreateDictionary {

    /**
     * Test to see if 2-parameter constructor creates Dictionary
     *  with title Oxford Dictionary, number of pages 899, and 
     *  the default number of definitions 10,000
     */
    @Test
    public void test2ParameterConstructorShouldHaveTitleOxfordDictionaryAndPage899And10000Definitions() {
    	Dictionary theDictionary = new Dictionary("Oxford Dictionary", 899);
    	assertEquals("A book named Oxford Dictionary with 899 pages and 10000 definitions", theDictionary.toString());
    }
    
    /**
     * Test to see if 3-parameter constructor creates Dictionary
     *  with title Websters Dictionary, number of pages 5701, and 
     *  the number of definitions 54,599
     */
    @Test
    public void test3ParameterConstructorShouldHaveTitleWebstersDictionaryAndPage5701And54599Definitions() {
    	Dictionary theDictionary = new Dictionary("Websters Dictionary", 5701, 54599);
    	assertEquals("A book named Websters Dictionary with 5701 pages and 54599 definitions", theDictionary.toString());
    }

}
