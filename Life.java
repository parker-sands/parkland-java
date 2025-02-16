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
* 2. Stores policyholder's name, age, and term life coverage amount.
* 3. Calculates the agent's commission based on term life coverage.
* 
******************************************************************************
* 
* LAB INSTRUCTIONS
* 1. Implement a class `Life` to store insurance details.
* 2. Implement constructors, getters, setters, `computeCommission()`, 
*    and `toString()`.
* 3. Ensure commission is calculated using:
*    commission = term life * 20%
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
* Life Policy
* -----------
* Name: Cosmo Kramer
* Age: 35
* Term: $50,000.00
* Commission: $10,000.00
* 
******************************************************************************
*
* MY THOUGHT PROCESS
* 1. Define attributes (name, age, term life amount).
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
* 1. Compute commission as 20% of term life coverage.
* 
* OUTPUT
* 1. Displays policy details and calculated commission.
* 
*****************************************************************************/

package java2_lab_01_insurance_policies;

public class Life {
    private String firstName;
    private String lastName;
    private int age;
    private double termLife;

    // Constructor
    public Life(String firstName, String lastName, int age, double termLife) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.termLife = termLife;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public double getTermLife() { return termLife; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setTermLife(double termLife) { this.termLife = termLife; }

    // Compute commission
    public double computeCommission() {
        return termLife * 0.20;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Life Policy\n" +
               "-----------\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Age: " + age + "\n" +
               "Term: $" + String.format("%,.2f", termLife) + "\n" +
               "Commission: $" + String.format("%,.2f", computeCommission());
    }
}
