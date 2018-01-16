package edu.westga.cs6312.newrepo;

import java.util.List;

/**
 * This class is used as sample code to explore version control with Git.
 *  * 
 * @author Kent Kraus
 * @version 2018-01-07
 */
public class Demo {
    /**
     * This is the entry point for the application. It generates a list and outputs
     *   the contents to the console.
     * 
     * @param args  Command-line arguments, not used
     */
    public static void main(String[] args) {
        List<String> myList = List.of("one", "two", "three");
		for (String current : myList) {
		    System.out.println(current);
		}
		System.out.println("I love Java!");
    }
};
