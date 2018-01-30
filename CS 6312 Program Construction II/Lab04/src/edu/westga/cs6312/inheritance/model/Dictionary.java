package edu.westga.cs6312.inheritance.model;

/**
 * This class models a dictionary and tracks the number of definitions within
 * 
 * @author Kent Kraus
 * @version 2018-01-28
 */
public class Dictionary extends Book {
    private int numberOfDefinitions;
    
    /**
     * Initializes a Dictionary object with the title and pages
     *  of the corresponding parameters
     * 
     * @param title	The title of the dictionary
     * @param pages	The number of pages in the dictionary
     */
    public Dictionary(String title, int pages) {
	super(title, pages);
        this.numberOfDefinitions = 10000;
    }
    
    /**
     * Initializes a Dictionary object with the title, pages, and
     *  number of definitions of the corresponding parameters
     * 
     * @param title	The title of the dictionary
     * @param pages	The number of pages in the dictionary
     * @param definitions	The number of definitions in the dictionary
     */
    public Dictionary(String title, int pages, int definitions) {
	super(title, pages);
        this.numberOfDefinitions = definitions;
    }
    
    @Override
    public String toString() {
    	
    	return super.toString() + " and " + this.numberOfDefinitions + " definitions";
    }

    /**
     * Accessor for the number of definitions in the dictionary
     * 
     * @return the number of definitions in the dictionary
     */
    public int getDefinitions() {
        return this.numberOfDefinitions;
    }

    /**
     * Mutator to set the number of definitions in the dictionary
     * 
     * @param definitions	the number of definitions to set
     */
    public void setDefinitions(int definitions) {
        this.numberOfDefinitions = definitions;
    }
    
}
