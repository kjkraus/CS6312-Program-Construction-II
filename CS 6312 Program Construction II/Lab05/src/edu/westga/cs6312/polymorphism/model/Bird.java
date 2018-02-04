package edu.westga.cs6312.polymorphism.model;

/**
 * This class models a Bird and tracks its type
 * 
 * @author Kent Kraus
 * @version 2018-02-04
 */
public abstract class Bird extends Animal {
    
    /**
     * 1-parameter constructor to accept a Bird kind of Animal
     * 
     * @param kind	The kind of animal being created
     */
    public Bird(String kind) {
	super(kind, "feathers");	
    }

    @Override
    public String getMovement(boolean fastMovement) {
    	if (fastMovement) {
    	    return "I fly";	
    	}
    	return "I walk on two legs";
    }
    
}
