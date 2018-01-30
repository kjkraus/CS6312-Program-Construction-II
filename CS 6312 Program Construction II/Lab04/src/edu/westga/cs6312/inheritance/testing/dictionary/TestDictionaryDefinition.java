package edu.westga.cs6312.inheritance.testing.dictionary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import edu.westga.cs6312.inheritance.model.Dictionary;

class TestDictionaryDefinition {

    /**
     * Test to get the number of definitions when the dictionary has default 
     *  (10,000) definitions
     */
    @Test
    public void testGetNumberOfDefinitionsForDictionaryWith10000() {
    	Dictionary theDictionary = new Dictionary("Merriam-Webster", 5001);
    	assertEquals(10000, theDictionary.getDefinitions());
    }
    
    /**
     * Test to get the number of definitions when the dictionary has 
     *  10 definitions
     */
    @Test
    public void testGetNumberOfDefinitionsForDictionaryWith101() {
    	Dictionary theDictionary = new Dictionary("Old Arabic", 55, 10);
    	assertEquals(10, theDictionary.getDefinitions());
    }
    
    /**
     * Test to set the number of definitions when the dictionary has 
     *  129,788 definitions
     */
    @Test
    public void testSetNumberOfDefinitionsForDictionaryTo129788() {
    	Dictionary theDictionary = new Dictionary("Old English", 4999, 2000);
    	theDictionary.setDefinitions(129788);
    	assertEquals(129788, theDictionary.getDefinitions());
    }
    
    /**
     * Test to set the number of definitions when the dictionary has 
     *  333 definitions
     */
    @Test
    public void testSetNumberOfDefinitionsForDictionaryTo333() {
    	Dictionary theDictionary = new Dictionary("Old Gaelic", 799, 9999);
    	theDictionary.setDefinitions(333);
    	assertEquals(333, theDictionary.getDefinitions());
    }
}
