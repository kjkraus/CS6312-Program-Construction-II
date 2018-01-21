package edu.westga.cs6312.zuul.model;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author David J. Barnes and Michael Kolling
 * MODIFIED BY:
 * 
 * @version 2008.03.30
 * MODIFIED ON:
 */

public class Room {
    private String description;
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) {
        this.description = description;
    }

    /**
     * Returns the Room's description
     * @return The description of the room.
     */
    public String getDescription() {
        return this.description;
    }
    
    /**
     * Return a long description of this room, of the form:
     * 	 You are in the kitchen.
     *   Exits: north west
     *   
     *   @return A description of the room, including exits.		
     */
    public String getLongDescription() {
        return "You are " + description + ".\n" + this.getExitString();
    }    
    
    /**
     * Return the room that is reached if we go in direction "direction"
     * 
     * @param	direction	The room's exit direction
     * @return	null	If there is no room in direction, return null
     */
    public Room getExit(String direction) {
	
		if (direction.equals("north")) {
	    	return this.northExit;
		} else if (direction.equals("east")) {
		    return this.eastExit;
		} else if (direction.equals("south")) {
		    return this.southExit;
		} else if (direction.equals("west")) {
		    return this.westExit;
		}
		return null;
    }
    
    /**
     * Return a description of the room's exits,
     * 	 for example, "Exits: north west".
     * 
     * @return  A description of the available exits.
     */
    public String getExitString() {
        String exitString = "Exits: ";
        
        if (this.northExit != null) {
            exitString += "north "; 
        }
    	if (this.eastExit != null)  {
    	    exitString += "east "; 
    	}
    	if (this.southExit != null) {
    	    exitString += "south "; 
    	}
    	if (this.westExit != null)  {
    	    exitString += "west "; 
    	} 
    	return exitString;
    }          
    
    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west) {
        if (north != null) {
        	this.setNorthExit(north);
        }
        if (east != null) {
        	this.setEastExit(east);
        }
        if (south != null) {
        	this.setSouthExit(south);
        }
        if (west != null) {
        	this.setWestExit(west);
        }
    }

    /**
     * Accessor for north exit of room
     * 
     * @return the northExit
     */
    public Room getNorthExit() {
        return this.northExit;
    }

    /**
     * Mutator to set north exit of room
     * 
     * @param northExit the northExit to set
     */
    public void setNorthExit(Room northExit) {
        this.northExit = northExit;
    }

    /**
     * Accessor for south exit of room
     * 
     * @return the southExit
     */
    public Room getSouthExit() {
        return this.southExit;
    }

    /**
     * Mutator to set the south exit of room
     * 
     * @param southExit the southExit to set
     */
    public void setSouthExit(Room southExit) {
        this.southExit = southExit;
    }

    /**
     * Accessor for east exit of room
     * 
     * @return the eastExit
     */
    public Room getEastExit() {
        return this.eastExit;
    }

    /**
     * Mutator to set the east exit of room
     * 
     * @param eastExit the eastExit to set
     */
    public void setEastExit(Room eastExit) {
        this.eastExit = eastExit;
    }

    /**
     * Accessor for west exit of room
     * 
     * @return the westExit
     */
    public Room getWestExit() {
        return this.westExit;
    }

    /**
     * Mutator to set the west exit of room
     * 
     * @param westExit the westExit to set
     */
    public void setWestExit(Room westExit) {
        this.westExit = westExit;
    }

}
