package edu.westga.cs6312.zuul.controller;

import edu.westga.cs6312.zuul.view.Game;

/**
 * This class contains the entry point of the application
 * 
 * @author Kent Kraus
 * @version 2018-01-15
 */
public class ZuulDriver {

	/**
	 * The entry point of the application
	 * @param args	Used to accept command line arguments
	 */
	public static void main(String[] args) {
		Game nextAdventure = new Game();
		nextAdventure.play();
	}
}
