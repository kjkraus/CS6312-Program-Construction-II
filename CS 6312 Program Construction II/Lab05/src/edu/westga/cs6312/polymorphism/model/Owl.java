package edu.westga.cs6312.polymorphism.model;

/**
 * This class models an Owl
 * 
 * @author Kent Kraus
 * @version 2018-02-04
 */
public class Owl extends Bird {
    /**
     * 0-parameter constructor to create an Owl
     */
    public Owl() {
	super("owl");
    }

    @Override
    /**
     * Returns a description of the sound of an Owl
     */
    public String getSound() {
    	return "hoo hoo";
    }
}
