package edu.westga.cs6312.polymorphism.view;

import java.util.ArrayList;
import java.util.Scanner;
import edu.westga.cs6312.polymorphism.model.Animal;

/**
 * This class displays the welcome message, input options, and lists of animals
 * 
 * @author Kent Kraus
 * @version 2018-02-04
 */
public class AnimalTUI {
    private Scanner input;
    private ArrayList<Animal> listOfAnimals;
    
    /**
     * Creates a new AnimalTUI object
     */
    public AnimalTUI() {
        this.input = new Scanner(System.in);
        ArrayList<Animal> listOfAnimals = new ArrayList<Animal>();       
    }
    
    /**
     * Helper method to begin the routine of the textual user interface
     */
    public void run() {
    	System.out.println("\tWelcome to the Animal Collection application!");
    	int choice = 0;
    	
    	do {
            System.out.println();
            System.out.println("\t\t1 - Add an animal to the list (lion, owl, parrot, or wolf)");
            System.out.println("\t\t2 - Print the animals in the list");
            System.out.println("\t\t3 - Quit");
            System.out.println();
        
            System.out.print("\tEnter your choice: ");
            String enteredChoice = this.input.nextLine();
            choice = Integer.parseInt(enteredChoice);
            
            if (choice == 1) {
        	    this.addAnimal();
        	} else if (choice == 2) {
        	    this.listAllAnimals(); 
        	} else if (choice < 1 || choice > 3) {
        	    System.out.println();
        	    System.out.println("\tThat's not a valid choice. Please try again.");
        	}
        	
    	} while (choice != 3);
    	System.out.println();
    	System.out.println("\tThank you for using the Animal Collection application.");
    	System.out.println("\tGoodbye!");
    }
    
    /**
     * Helper method to display the list of animals.
     */
    private void listAllAnimals() {
		System.out.println();
		System.out.println("\tList of animals");	

	}
    
    /**
     * Helper method to add an animal to the list
     */
    public void addAnimal() {
        System.out.println();
        System.out.print("\tEnter the animal you would like to add: ");
        String givenAnimal = this.input.nextLine();
        
        if ((givenAnimal.equals("lion")) || (givenAnimal.equals("wolf")) 
        	|| (givenAnimal.equals("owl")) || (givenAnimal.equals("parrot"))) {
            this.listOfAnimals.add(Animal.getNewAnimal(givenAnimal));
            System.out.println("\tYour animal was added to the collection.");
        } else {
            System.out.println("\tThat animal type cannot be added!");
        }
    }
}
