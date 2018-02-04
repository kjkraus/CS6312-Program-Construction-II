package edu.westga.cs6312.polymorphism.model;

/**
 * This class models an Animal and tracks its type and covering
 * 
 * @author Kent Kraus
 * @version 02-04-2018
 */
public abstract class Animal {
    private String kindOfAnimal;
    private String coveringOfAnimal;

    /**
     * 2-parameter constructor to create an Animal object
     * 
     * @param kind	The kind of animal being created
     * @param covering	The animal's covering type
     * 
     * Precondition	kind != null
     * 			covering != null
     * Postcondition	An animal whose type is kind and is
     * 			covered with covering
     */
    public Animal(String kind, String covering) {
        if (kind == null) {
            throw new IllegalArgumentException("Invalid kind");
        }
        if (covering == null) {
            throw new IllegalArgumentException("Invalid covering");
        }
        this.kindOfAnimal = kind;
        this.coveringOfAnimal = covering;
    }
    
    /**
     * Returns description of the movement of the animal
     * 
     * @param fastMovement	A value to whether the Animal is moving fast or not 
     * @return			A description of the speed of the animal
     */
    public String getMovement(boolean fastMovement) {
        if (fastMovement) {
            return "I run on four legs";
        }
        return "I walk on four legs";
    }
    
    /**
     * Creates an Object of the corresponding Animal subclass
     * 
     * @param 	kind	The type of Animal
     * @return	an Object of the type kind
     */
    public static Animal getNewAnimal(String kind) {
        String theAnimal = kind.toLowerCase();
        
        if (theAnimal.equals("lion")) {
            return new Lion();
        } else if (theAnimal.equals("wolf")) {
            return new Wolf();
        } else if (theAnimal.equals("owl")) {
            return new Owl();
        } else if (theAnimal.equals("parrot")) {
            return new Parrot();
        }	    	
        return null;
    }
    
    /**
     * Returns the sound of the animal that is created
     * 
     * @return	a description of the corresponding animal sound
     */
    public abstract String getSound();
    
    /**
     * Returns a description of the Animal including
     * 	type and covering
     * 
     * @return	A description of the animal
     */
    public String toString() {
        return "This animal is a " + this.kindOfAnimal 
        	+ " that is covered with " + this.coveringOfAnimal;
    }       

}




