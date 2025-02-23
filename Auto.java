/******************************************************************************
*
* Auto.java
*
* Created by: Parker Sands
* Parkland College
* CSC-240, JAVA 2
* Spring 2025
*
******************************************************************************
*
* DESCRIPTION
* 1. Represents an Auto insurance policy.
* 2. Stores policyholder's name, vehicle details, liability, and collision
*    coverage.
* 3. Calculates the agent's commission based on liability and collision coverage.
* 4. Works with `CommissionCalculator` to integrate user input and policy
*    management via a menu system.
*
******************************************************************************
* 
* LAB INSTRUCTIONS
* 1. Implement a class `Auto` to store insurance details.
* 2. Implement constructors, getters, setters, `computeCommission()`, 
*    and `toString()`.
* 3. Ensure commission is calculated using:
*    commission = (liability + collision) * 30%
* 4. Support `CommissionCalculator` in handling user input 
*    (values are not hardcoded).
* 
******************************************************************************
*
* LAB HINTS
* 1. Use `this` keyword to differentiate instance variables from parameters.
* 2. Implement `computeCommission()` to return a `double` value.
* 3. Override `toString()` to provide formatted output.
* 4. Ensure compatibility with `CommissionCalculator` for menu-driven interactions.
* 
******************************************************************************
*
* EXAMPLE PROGRAM OUTPUT (Generated from CommissionCalculator)
* Auto Policy
* -----------
* Name: Jerry Seinfeld
* Make: Chevy
* Model: Malibu
* Liability: $10,000.00
* Collision: $50,000.00
* Commission: $18,000.00
* 
******************************************************************************
*
* MY THOUGHT PROCESS
* 1. Define attributes (first name, last name, make, model, liability, collision).
* 2. Implement a constructor to initialize values.
* 3. Provide getters and setters for encapsulation.
* 4. Implement `computeCommission()` using the formula.
* 5. Override `toString()` to format policy details.
* 6. Ensure the class interacts properly with `CommissionCalculator` for user input.
* 
******************************************************************************
*
* INPUT
* 1. User input will be handled via `Scanner` in `CommissionCalculator`.
* 
* PROCESSING AND CALCULATIONS
* 1. Compute commission as 30% of (liability + collision).
* 
* OUTPUT
* 1. Displays policy details and calculated commission when requested.
* 
*****************************************************************************/
package java2_lab_02_commission_calculator;

import java.text.DecimalFormat;

/**
 * Auto.java
 * Represents an Auto insurance policy.
 */

public class Auto {

	// Attributes
    private String firstName;
    private String lastName;
    private String make;
    private String model;
    private double liability;
    private double collision;
    private static final double COMMISSION_RATE = 0.30;

    // Default Constructor
    public Auto() {
        this.firstName = "";
        this.lastName = "";
        this.make = "";
        this.model = "";
        this.liability = 0.0;
        this.collision = 0.0;
    }
    
    // Parameterized Constructor
    public Auto(String firstName, String lastName, String make, String model, 
    		double liability, double collision) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.make = make;
        this.model = model;
        this.liability = liability;
        this.collision = collision;
    }
    
    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }
    
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    
    public double getLiability() { return liability; }
    public void setLiability(double liability) { this.liability = liability; }
    
    public double getCollision() { return collision; }
    public void setCollision(double collision) { this.collision = collision; }
    
    // Compute commission
    public double computeCommission() {
        return (liability + collision) * COMMISSION_RATE;
    }
    
    // toString() Method for formatted output
    @Override
    public String toString() {
    	String RED = "\u001B[31m"; // Red text
    	String RESET = "\u001B[0m"; // Reset to default
        DecimalFormat df = new DecimalFormat("$#,##0.00"); // Formats currency

        return "\n" + RED + "AUTO POLICY DETAILS" + RESET + "\n"
             + RED + "===========================\n" + RESET
             + "Name:       " + firstName + " " + lastName + "\n"
             + "Make:       " + make + "\n"
             + "Model:      " + model + "\n"
             + "Liability:  " + df.format(liability) + "\n"
             + "Collision:  " + df.format(collision) + "\n"
             + "Commission: " + df.format(computeCommission()) + "\n"
             + RED + "===========================\n" + RESET;
    }
}