package edu.westga.cs6312.polymorphism.model;

/**
 * This class models a Wolf
 * 
 * @author Kent Kraus
 * @version 2018-02-04
 */
public class Wolf extends Mammal {
    /**
     * 0-parameter constructor to create a Wolf
     */
    public Wolf() {
	super("wolf");
    }

    @Override
    /**
     * Returns a description of the sound of a wolf
     */
    public String getSound() {
    	return "howl";
    }
}
