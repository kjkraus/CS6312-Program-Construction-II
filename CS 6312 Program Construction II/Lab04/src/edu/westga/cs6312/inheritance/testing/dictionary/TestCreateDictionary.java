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

}
