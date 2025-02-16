/******************************************************************************
*
* PolicyTest.java
*
* Created by: Parker Sands
* Parkland College
* CSC-240, JAVA 2
* Spring 2025
*
******************************************************************************
*
* DESCRIPTION
* 1. This class serves as the driver for the Insurance Policies program.
* 2. It demonstrates the functionality of the Auto, Home, and Life policy classes.
* 3. The program creates instances of each policy type, computes commissions, and prints results.
* 
******************************************************************************
* 
* LAB INSTRUCTIONS
* 1. Instantiate objects for `Auto`, `Home`, and `Life` insurance policies.
* 2. Assign values using constructors and setters where applicable.
* 3. Call `computeCommission()` on each policy object.
* 4. Display policy details using `toString()`.
* 
******************************************************************************
*
* LAB HINTS
* 1. Use the constructors to initialize policy objects with sample data.
* 2. Call the `computeCommission()` method before displaying output.
* 3. Use `System.out.println()` to print policy details.
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
* Home Policy
* -----------
* Name: Elaine Benes
* Footage: 4000
* Dwelling: $32,000.00
* Contents: $5,000.00
* Liability: $10,000.00
* Commission: $10,400.00
*
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
* 1. Instantiate objects of `Auto`, `Home`, and `Life` policies.
* 2. Call `computeCommission()` on each object.
* 3. Use `toString()` to format output and display policy details.
* 
******************************************************************************
*
* INPUT
* 1. No user input required; values are hardcoded.
* 
* PROCESSING AND CALCULATIONS
* 1. Computes commission using formulas from policy classes.
* 
* OUTPUT
* 1. Displays policy details, including computed commissions.
* 
*****************************************************************************/

package java2_lab_01_insurance_policies;

public class PolicyTest {
    public static void main(String[] args) {
        // Create and set an Auto policy object using constructor
        Auto autoPolicy = new Auto("Jerry", "Seinfeld", "Chevy", "Malibu", 
        10000.0, 50000.0);
        System.out.println(autoPolicy);
        System.out.println();

        // Create and set a Home policy object using setters
        Home homePolicy = new Home("Elaine", "Benes", 4000, 32000.0, 5000.0, 
        10000.0);
        System.out.println(homePolicy);
        System.out.println();

        // Create and set a Life policy object using constructor
        Life lifePolicy = new Life("Cosmo", "Kramer", 35, 50000.0);
        System.out.println(lifePolicy);
    }
}
