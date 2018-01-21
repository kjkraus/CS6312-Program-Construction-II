package edu.westga.cs6312.locks.model;

import java.util.ArrayList;

/**
 * This class will model a 4-digit bicycle lock.
 * 
 * @author Kent Kraus
 * @version 2018-01-20
 */
public class BikeLock {
    private ArrayList<Dial> lockDials;
    private ArrayList<Integer> lockCombination;
    
    /**
     * Constructor to create BikeLock object with combination 1234
     */
    public BikeLock() {
        this(1, 2, 3, 4);
    }
    
    /**
     * Initializes the BikeLock object and combination to the value
     *  of the corresponding parameters
     *  
     *  @param	digitFirstDial	The combination digit of the first Dial
     *  @param	digitSecondDial	The combination digit of the second Dial
     *  @param	digitThirdDial	The combination digit of the third Dial
     *  @param	digitFourthDial	The combination digit of the fourth Dial
     */
    public BikeLock(int digitFirstDial, int digitSecondDial, int digitThirdDial, int digitFourthDial) {
        this.lockDials = new ArrayList<Dial>();
        
        Dial dialA = new Dial();
        Dial dialB = new Dial();
        Dial dialC = new Dial();
        Dial dialD = new Dial();
        	
        this.lockDials.add(dialA);
        this.lockDials.add(dialB);
        this.lockDials.add(dialC);
        this.lockDials.add(dialD);
        	
        this.lockCombination = new ArrayList<Integer>();
        this.lockCombination.add(digitFirstDial);
        this.lockCombination.add(digitSecondDial);
        this.lockCombination.add(digitThirdDial);
        this.lockCombination.add(digitFourthDial);
    }
    
    /**
     * Builds and returns an output of BikeLock actual combination
     *  and currently shown combination
     *  
     *  @return A String representation of the BikeLock
     */
    public String toString() {
        String lockActualCombination = "";
        String lockDisplay = "";
        	
        for (Integer combinationDigit : this.lockCombination) {
            lockActualCombination += combinationDigit;
        }
        	
        for (Dial currentDialDigit : this.lockDials) {
            lockDisplay += currentDialDigit.getValue();
        }
        		
        return "BikeLock with combination " + lockActualCombination 
        	+ " that's currently showing " + lockDisplay;
    }
    
    /**
     * This method will increment the Dial at the position specified 
     *  by the number of turns specified
     *  
     *  @param	dialPosition	(zero-based) Dial at position 0, first Dial
     *  @param 	numberOfTurns	number of times to increment the specified Dial
     */
    public void incrementDial(int dialPosition, int numberOfTurns) {
        for (int count = 0; count < numberOfTurns; count++) {
            this.lockDials.get(dialPosition).increment();
    	}
    }
    
    /**
     * This method will decrement the Dial at the position specified 
     *  by the number of turns specified
     *  
     *  @param	dialPosition	(zero-based) Dial at position 0, first Dial
     *  @param 	numberOfTurns	number of times to increment the specified Dial
     */
    public void decrementDial(int dialPosition, int numberOfTurns) {
        for (int count = 0; count < numberOfTurns; count++) {
            this.lockDials.get(dialPosition).decrement();
        }
    }
    
    /**
     * This method will return true if the Dials are currently showing the same
     *  numbers, in the same order, as the combination
     *  
     *  @return true if and only if the combination values equal the displayed values
     */
    public boolean isOpen() {	
        String lockActualCombination = "";
        String lockDisplay = "";
        
        for (Integer combinationDigit : this.lockCombination) {
            lockActualCombination += combinationDigit;
        }
        	
        for (Dial currentDialDigit : this.lockDials) {
            lockDisplay += currentDialDigit.getValue();
        }
        return lockDisplay.equals(lockActualCombination);
    }    
}
