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
* 
******************************************************************************
* 
* LAB INSTRUCTIONS
* 1. Implement a class `Auto` to store insurance details.
* 2. Implement constructors, getters, setters, `computeCommission()`, 
*    and `toString()`.
* 3. Ensure commission is calculated using:
*    commission = (liability + collision) * 30%
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
* 1. Define attributes (name, make, model, liability, collision).
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
* 1. Compute commission as 30% of (liability + collision).
* 
* OUTPUT
* 1. Displays policy details and calculated commission.
* 
*****************************************************************************/

package java2_lab_01_insurance_policies;

public class Auto {
    private String firstName;
    private String lastName;
    private String make;
    private String model;
    private double liability;
    private double collision;

    // Constructor
    public Auto(String firstName, String lastName, String make, String model, 
    double liability, double collision) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.make = make;
        this.model = model;
        this.liability = liability;
        this.collision = collision;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public double getLiability() { return liability; }
    public double getCollision() { return collision; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setLiability(double liability) { this.liability = liability; }
    public void setCollision(double collision) { this.collision = collision; }

    // Compute commission
    public double computeCommission() {
        return (liability + collision) * 0.30;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Auto Policy\n" +
               "-----------\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Make: " + make + "\n" +
               "Model: " + model + "\n" +
               "Liability: $" + String.format("%,.2f", liability) + "\n" +
               "Collision: $" + String.format("%,.2f", collision) + "\n" +
               "Commission: $" + String.format("%,.2f", computeCommission());
    }
}
