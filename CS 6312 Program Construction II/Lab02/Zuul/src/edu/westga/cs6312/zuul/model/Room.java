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
    public String description;
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;

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
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west) {
        if (north != null) {
        	this.northExit = north;
        }
        if (east != null) {
        	this.eastExit = east;
        }
        if (south != null) {
        	this.southExit = south;
        }
        if (west != null) {
        	this.westExit = west;
        }
    }


}
