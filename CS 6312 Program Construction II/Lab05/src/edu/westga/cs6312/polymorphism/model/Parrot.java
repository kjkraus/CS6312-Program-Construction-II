package edu.westga.cs6312.polymorphism.model;

/**
 * This class models a Parrot
 * 
 * @author Kent Kraus
 * @version 2018-02-04
 */
public class Parrot extends Bird {
    /**
     * 0-parameter constructor to create a Parrot
     */
    public Parrot() {
	super("parrot");
    }

    @Override
    /**
     * Returns a description of the sound of a parrot
     */
    public String getSound() {
    	return "squawk";
    }
}
