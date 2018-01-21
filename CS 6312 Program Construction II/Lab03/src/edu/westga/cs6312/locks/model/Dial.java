package edu.westga.cs6312.locks.model;

/**
 * This class will track the current value of a dial in a bicycle lock.
 * 
 * @author Kent Kraus
 * @version 2018-01-20
 */
public class Dial {
    private int currentValue;
    private static final int MAX_VALUE = 9;
    
    /**
     * Creates a new Dial object
     */
    public Dial() {
        this.currentValue = 0;

    }
    
    /**
     * Gets the current Dial value
     * @return	currentValue	The current value of the Dial
     */
    public int getValue() {
        return this.currentValue;
    }
    
    /**
     * Increments the Dial's current value
     */
    public void increment() {
        this.currentValue++;
        if (this.currentValue > MAX_VALUE) {
            this.currentValue = 0;
        }
    }
    
    /**
     * Decrements the Dial's current value
     */
    public void decrement() {
        this.currentValue--;
        if (this.currentValue < 0) {
            this.currentValue = 9;
        }
    }
}
