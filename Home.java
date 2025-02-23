/******************************************************************************
*
* Home.java
*
* Created by: Parker Sands
* Parkland College
* CSC-240, JAVA 2
* Spring 2025
*
******************************************************************************
*
* DESCRIPTION
* 1. Represents a Home insurance policy.
* 2. Stores policyholder's name, home square footage, dwelling coverage,
*    contents coverage, and liability coverage.
* 3. Calculates the agent's commission based on total insured amounts.
* 4. Works with `CommissionCalculator` to integrate user input and policy
*    management via a menu system.
*
******************************************************************************
* 
* LAB INSTRUCTIONS
* 1. Implement a class `Home` to store insurance details.
* 2. Implement constructors, getters, setters, `computeCommission()`, 
*    and `toString()`.
* 3. Ensure commission is calculated using:
*    commission = (dwelling + contents + liability) * 20%
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
* Home Policy
* -----------
* Name: Elaine Benes
* Footage: 3000
* Dwelling: $600,000.00
* Contents: $500,000.00
* Liability: $400,000.00
* Commission: $340,000.00
* 
******************************************************************************
*
* MY THOUGHT PROCESS
* 1. Define attributes (first name, last name, square footage, dwelling, 
*    contents, liability).
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
* 1. Compute commission as 20% of (dwelling + contents + liability).
* 
* OUTPUT
* 1. Displays policy details and calculated commission when requested.
* 
*****************************************************************************/
package java2_lab_02_commission_calculator;

import java.text.DecimalFormat;

/**
 * Home.java
 * Represents a Home insurance policy.
 */

public class Home {

	// Attributes
    private String firstName;
    private String lastName;
    private int squareFootage;
    private double dwelling;
    private double contents;
    private double liability;
    private static final double COMMISSION_RATE = 0.20;

    // Default Constructor
    public Home() {
        this.firstName = "";
        this.lastName = "";
        this.squareFootage = 0;
        this.dwelling = 0.0;
        this.contents = 0.0;
        this.liability = 0.0;
    }
    
    // Parameterized Constructor
    public Home(String firstName, String lastName, int squareFootage, 
    		double dwelling, double contents, double liability) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.squareFootage = squareFootage;
        this.dwelling = dwelling;
        this.contents = contents;
        this.liability = liability;
    }
    
    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public int getSquareFootage() { return squareFootage; }
    public void setSquareFootage(int squareFootage) { this.squareFootage = squareFootage; }
    
    public double getDwelling() { return dwelling; }
    public void setDwelling(double dwelling) { this.dwelling = dwelling; }
    
    public double getContents() { return contents; }
    public void setContents(double contents) { this.contents = contents; }
    
    public double getLiability() { return liability; }
    public void setLiability(double liability) { this.liability = liability; }
    
    // Compute commission
    public double computeCommission() {
        return (dwelling + contents + liability) * COMMISSION_RATE;
    }
    
    // toString() Method for formatted output
    @Override
    public String toString() {
    	String PINK = "\u001B[35m"; // Magenta
    	String RESET = "\u001B[0m"; // Reset to default
        DecimalFormat df = new DecimalFormat("$#,##0.00");

        return "\n" + PINK + "HOME POLICY DETAILS" + RESET + "\n"
             + PINK + "===========================\n" + RESET
             + "Name:        " + firstName + " " + lastName + "\n"
             + "Footage:     " + squareFootage + " sq ft\n"
             + "Dwelling:    " + df.format(dwelling) + "\n"
             + "Contents:    " + df.format(contents) + "\n"
             + "Liability:   " + df.format(liability) + "\n"
             + "Commission:  " + df.format(computeCommission()) + "\n"
             + PINK + "===========================\n" + RESET;
    }
}

