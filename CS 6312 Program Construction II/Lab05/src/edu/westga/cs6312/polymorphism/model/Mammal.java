package edu.westga.cs6312.polymorphism.model;

/**
 * This class models a Mammal and tracks its type
 * 
 * @author Kent Kraus
 * @version 2018-02-04
 */
public abstract class Mammal extends Animal {

    /**
     * 1-parameter constructor to accept a Mammal kind of Animal
     * 
     * @param kind	The kind of animal being created
     */
    public Mammal(String kind) {
	super(kind, "hair");	
    }
}
