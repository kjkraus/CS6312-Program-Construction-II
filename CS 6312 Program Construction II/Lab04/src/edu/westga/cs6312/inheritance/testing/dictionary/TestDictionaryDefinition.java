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

}
