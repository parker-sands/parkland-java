/******************************************************************************
*
* Driver.java
*
* Created by: Parker Sands
* Parkland College
* CSC-240, JAVA 2
* Spring 2025
*
******************************************************************************
*
* DESCRIPTION
* 1. This is the main driver class for the Commission Calculator program.
* 2. It initializes a `CommissionCalculator` object and starts the menu-driven program.
*
******************************************************************************
*
* LAB INSTRUCTIONS
* 1. Implement a `Driver` class with a `main()` method.
* 2. Inside `main()`, create a `CommissionCalculator` object.
* 3. Call the `Run()` method on the `CommissionCalculator` object.
*
******************************************************************************
*
* LAB HINTS
* 1. The `Driver` class should contain **ONLY** the `main()` method.
* 2. No direct user input or calculations should happen inside `Driver.java`.
* 3. Keep `main()` clean and simple.
*
******************************************************************************
*
* EXAMPLE PROGRAM EXECUTION
*
* -----------------------------
* Welcome to Parkland Insurance
* -----------------------------
* (Menu-driven system starts...)
*
******************************************************************************
*/

// Package declaration (if needed)
package java2_lab_02_commission_calculator;

public class Driver {
    public static void main(String[] args) {
        // Create CommissionCalculator object
        CommissionCalculator calc = new CommissionCalculator();
        
        // Run the program
        calc.Run();
    }
}
