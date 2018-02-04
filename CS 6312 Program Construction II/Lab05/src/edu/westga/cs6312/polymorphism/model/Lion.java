package edu.westga.cs6312.polymorphism.model;

/**
 * This class models a Lion 
 * 
 * @author Kent Kraus
 * @version 2018-02-04
 */
public class Lion extends Mammal {
    
    /**
     * 0-parameter constructor to create a Lion
     */
    public Lion() {
	super("lion");
    }

    @Override
    /**
     * Returns a description of the sound of a lion
     */
    public String getSound() {
    	return "roar";
    }
}
