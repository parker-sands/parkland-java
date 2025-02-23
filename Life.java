/******************************************************************************
*
* Life.java
*
* Created by: Parker Sands
* Parkland College
* CSC-240, JAVA 2
* Spring 2025
*
******************************************************************************
*
* DESCRIPTION
* 1. Represents a Life insurance policy.
* 2. Stores policyholder's name, insured age, and term coverage amount.
* 3. Calculates the agent's commission based on the term coverage.
* 4. Works with `CommissionCalculator` to integrate user input and policy
*    management via a menu system.
*
******************************************************************************
* 
* LAB INSTRUCTIONS
* 1. Implement a class `Life` to store insurance details.
* 2. Implement constructors, getters, setters, `computeCommission()`, 
*    and `toString()`.
* 3. Ensure commission is calculated using:
*    commission = term coverage * 20%
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
* Life Policy
* -----------
* Name: Cosmo Kramer
* Age: 42
* Term: $500,000.00
* Commission: $100,000.00
* 
******************************************************************************
*
* MY THOUGHT PROCESS
* 1. Define attributes (first name, last name, age, term coverage).
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
* 1. Compute commission as 20% of term coverage.
* 
* OUTPUT
* 1. Displays policy details and calculated commission when requested.
* 
*****************************************************************************/
package java2_lab_02_commission_calculator;

import java.text.DecimalFormat;

/**
 * Life.java
 * Represents a Life insurance policy.
 */

public class Life {

	// Attributes
    private String firstName;
    private String lastName;
    private int age;
    private double termCoverage;
    private static final double COMMISSION_RATE = 0.20;

    // Default Constructor
    public Life() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.termCoverage = 0.0;
    }
    
    // Parameterized Constructor
    public Life(String firstName, String lastName, int age, double termCoverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.termCoverage = termCoverage;
    }
    
    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public double getTermCoverage() { return termCoverage; }
    public void setTermCoverage(double termCoverage) { this.termCoverage = termCoverage; }
    
    // Compute commission
    public double computeCommission() {
        return termCoverage * COMMISSION_RATE;
    }
    
    // toString() Method for formatted output
    @Override
    public String toString() {
    	String SKY_BLUE = "\u001B[38;5;45m"; // Light blue text
    	String RESET = "\u001B[0m"; // Reset to default
        DecimalFormat df = new DecimalFormat("$#,##0.00");

        return "\n" + SKY_BLUE + "LIFE POLICY DETAILS" + RESET + "\n"
             + SKY_BLUE + "===========================\n" + RESET
             + "Name:        " + firstName + " " + lastName + "\n"
             + "Age:         " + age + " years\n"
             + "Term:        " + df.format(termCoverage) + "\n"
             + "Commission:  " + df.format(computeCommission()) + "\n"
             + SKY_BLUE + "===========================\n" + RESET;
    }
}

