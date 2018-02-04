package edu.westga.cs6312.polymorphism.controller;

import edu.westga.cs6312.polymorphism.view.AnimalTUI;

/**
 * This class will execute the input-based textual user interface.
 * 
 * @author Kent Kraus
 * @version 2018-02-04
 */
public class AnimalDriver {

    /**
     * This is the entry point for the application. It creates a AnimalTUI instance
     *  and executes the textual user interface.
     * 
     * @param args	Command-line arguments, not used
     */
    public static void main(String[] args) {
        AnimalTUI demoTextInterface = new AnimalTUI();
        demoTextInterface.run();
    }
}
