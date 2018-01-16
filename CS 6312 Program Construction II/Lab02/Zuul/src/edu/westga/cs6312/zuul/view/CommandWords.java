package edu.westga.cs6312.zuul.view;

/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognize commands as they are typed in.
 *
 * @author David J. Barnes and Michael Kolling
 * MODIFIED BY:
 * 
 * @version 2008.03.30
 * MODIFIED ON:
 */

public class CommandWords {
    // a constant array that holds all valid command words
    private static final String[] VALID_COMMANDS = {
        "go", "quit", "help"
    };

    /**
     * Constructor - initialize the command words.
     */
    public CommandWords() {
        // nothing to do at the moment...
    }

    /**
     * Check whether a given String is a valid command word. 
     * @param	aString	The String that is possibly holding a command
     * 
     * @return true if a given string is a valid command,
     * 			false if it isn't.
     */
    public boolean isCommand(String aString) {
    	for (String current : VALID_COMMANDS) {
            if (current.equals(aString)) {
                return true;
            }
        }
        // if we get here, the string was not found in the commands
        return false;
    }
}
