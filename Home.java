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
* 2. Stores policyholder's name, house square footage, dwelling, contents, 
*    and liability coverage.
* 3. Calculates the agent's commission based on liability, dwelling, 
*    and contents coverage.
* 
******************************************************************************
* 
* LAB INSTRUCTIONS
* 1. Implement a class `Home` to store insurance details.
* 2. Implement constructors, getters, setters, `computeCommission()`, 
*    and `toString()`.
* 3. Ensure commission is calculated using:
*    commission = (liability * 30%) + ((dwelling + contents) * 20%)
* 
******************************************************************************
*
* LAB HINTS
* 1. Use `this` keyword to differentiate instance variables from parameters.
* 2. Implement `computeCommission()` to return a `double` value.
* 3. Override `toString()` to provide formatted output.
* 
******************************************************************************
*
* EXAMPLE PROGRAM OUTPUT
* Home Policy
* -----------
* Name: Elaine Benes
* Footage: 4000
* Dwelling: $32,000.00
* Contents: $5,000.00
* Liability: $10,000.00
* Commission: $10,400.00
* 
******************************************************************************
*
* MY THOUGHT PROCESS
* 1. Define attributes (name, footage, dwelling, contents, liability).
* 2. Implement a constructor to initialize values.
* 3. Provide getters and setters for encapsulation.
* 4. Implement `computeCommission()` using the formula.
* 5. Override `toString()` to format policy details.
* 
******************************************************************************
*
* INPUT
* 1. No user input required; values are hardcoded.
* 
* PROCESSING AND CALCULATIONS
* 1. Compute commission using the formula provided.
* 
* OUTPUT
* 1. Displays policy details and calculated commission.
* 
*****************************************************************************/

package java2_lab_01_insurance_policies;

public class Home {
    private String firstName;
    private String lastName;
    private int squareFootage;
    private double dwelling;
    private double contents;
    private double liability;

    // Constructor
    public Home(String firstName, String lastName, int squareFootage, 
    double dwelling, double contents, double liability) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.squareFootage = squareFootage;
        this.dwelling = dwelling;
        this.contents = contents;
        this.liability = liability;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getSquareFootage() { return squareFootage; }
    public double getDwelling() { return dwelling; }
    public double getContents() { return contents; }
    public double getLiability() { return liability; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setSquareFootage(int squareFootage) { this.squareFootage = squareFootage; }
    public void setDwelling(double dwelling) { this.dwelling = dwelling; }
    public void setContents(double contents) { this.contents = contents; }
    public void setLiability(double liability) { this.liability = liability; }

    // Compute commission
    public double computeCommission() {
        return (liability * 0.30) + ((dwelling + contents) * 0.20);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Home Policy\n" +
               "-----------\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Footage: " + squareFootage + "\n" +
               "Dwelling: $" + String.format("%,.2f", dwelling) + "\n" +
               "Contents: $" + String.format("%,.2f", contents) + "\n" +
               "Liability: $" + String.format("%,.2f", liability) + "\n" +
               "Commission: $" + String.format("%,.2f", computeCommission());
    }
}
